package app.web.template.account.application.port;

public interface AccountPortNotifierCreate {
    void notifyAboutNewAccount(String email, String token);
}
