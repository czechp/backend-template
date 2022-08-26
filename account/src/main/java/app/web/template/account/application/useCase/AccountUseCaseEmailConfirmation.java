package app.web.template.account.application.useCase;

import app.web.template.account.domain.Account;

public interface AccountUseCaseEmailConfirmation {
    Account accountEmailConfirmation(String token);
}
