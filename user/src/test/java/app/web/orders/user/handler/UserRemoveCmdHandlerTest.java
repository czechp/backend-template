package app.web.orders.user.handler;

import app.web.orders.user.event.UserRemoved;
import app.web.orders.user.application.handler.UserRemoveCmdHandler;
import app.web.orders.user.application.command.UserRemoveCmd;
import app.web.orders.user.domain.UserRepository;
import app.web.orders.user.domain.UserTestFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
class UserRemoveCmdHandlerTest {
    @Mock
    UserRepository userRepository;

    UserRemoveCmdHandler userRemoveCmdHandler;

    @BeforeEach
    void init() {
        this.userRemoveCmdHandler = new UserRemoveCmdHandler(userRepository);
    }

    @Test
    @DisplayName("User remove cmd handler - ok")
    void UserRemoveTest() {
        //given
        final var userId = 1L;
        UserRemoveCmd userRemoveCmd = new UserRemoveCmd(userId);
        //when
        Mockito.when(userRepository.findByIdOrThrowException(anyLong())).thenReturn(UserTestFactory.getUserForRemoveCmdHandler());
        UserRemoved userRemoved = userRemoveCmdHandler.removeUser(userRemoveCmd);
        //then
        Mockito.verify(userRepository, Mockito.times(1)).remove(any());

    }

}