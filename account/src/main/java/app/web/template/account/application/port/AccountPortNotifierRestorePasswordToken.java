package app.web.template.account.application.port;

public interface AccountPortNotifierRestorePasswordToken {
    void sendRestorePasswordToken(String email, String token);
}
