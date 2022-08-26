package app.web.template.account.application.useCase;

import app.web.template.account.domain.Account;

public interface AccountUseCaseAdminActivation {
    Account accountAdminActivation(long id, boolean activation);
}
