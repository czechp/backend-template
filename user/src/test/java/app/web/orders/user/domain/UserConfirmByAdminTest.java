package app.web.orders.user.domain;

import app.web.orders.user.event.UserConfirmedByAdmin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserConfirmByAdminTest {
    @Test
    @DisplayName("User.confirmByAdmin() - ok")
    void confirmByAdminTest() {
        //given
        final boolean targetState = true;
        User user = User.builder()
                .withUserActive(UserActive.builder().build())
                .build();
        //when
        UserConfirmedByAdmin userConfirmedByAdmin = user.confirmUserByAdmin(targetState);
        //then
        assertEquals(targetState, userConfirmedByAdmin.isConfirmedByAdmin());
    }
}