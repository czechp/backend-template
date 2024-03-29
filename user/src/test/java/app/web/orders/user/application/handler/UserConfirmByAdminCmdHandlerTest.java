package app.web.orders.user.application.handler;

import app.web.orders.user.event.UserConfirmedByAdmin;
import app.web.orders.user.application.command.UserConfirmByAdminCmd;
import app.web.orders.user.domain.User;
import app.web.orders.user.domain.UserRepository;
import app.web.orders.user.domain.UserTestFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
class UserConfirmByAdminCmdHandlerTest {
    @Mock
    UserRepository userRepository;

    UserConfirmByAdminCmdHandler userConfirmByAdminCmdHandler;

    @BeforeEach
    void init() {
        this.userConfirmByAdminCmdHandler = new UserConfirmByAdminCmdHandler(userRepository);
    }

    @Test
    @DisplayName("UserConfirmByAdminCmdHandler.confirmByAdmin - ok")
    void confirmByAdminTest() {
        //given
        final long userId = 1L;
        final boolean targetState = true;
        UserConfirmByAdminCmd userConfirmByAdminCmd = new UserConfirmByAdminCmd(userId, targetState);
        final User userToConfirmation = UserTestFactory.getUserForConfirmByAdminCmdHandler();
        //when
        Mockito.when(userRepository.findByIdOrThrowException(anyLong())).thenReturn(userToConfirmation);
        UserConfirmedByAdmin userConfirmedByAdmin = userConfirmByAdminCmdHandler.confirmByAdmin(userConfirmByAdminCmd);
        //then
        assertEquals(targetState, userConfirmedByAdmin.isConfirmedByAdmin());
        Mockito.verify(userRepository, Mockito.times(1)).save(any());
    }
}