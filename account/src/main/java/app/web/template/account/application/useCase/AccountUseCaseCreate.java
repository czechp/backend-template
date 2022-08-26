package app.web.template.account.application.useCase;

import app.web.template.account.application.dto.AccountCreateCmdDto;
import app.web.template.account.domain.Account;

public interface AccountUseCaseCreate {
    Account createAccount(AccountCreateCmdDto accountCreateCmdDto);
}
