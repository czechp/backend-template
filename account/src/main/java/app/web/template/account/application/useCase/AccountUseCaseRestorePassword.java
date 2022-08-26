package app.web.template.account.application.useCase;

import app.web.template.account.domain.Account;

public interface AccountUseCaseRestorePassword {
    Account generateTokenToRestorePassword(String email);

    Account setNewPassword(String token, String newPassword);
}
