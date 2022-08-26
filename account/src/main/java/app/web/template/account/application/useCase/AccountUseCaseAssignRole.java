package app.web.template.account.application.useCase;

import app.web.template.account.adapter.persistence.AccountRole;
import app.web.template.account.domain.Account;

public interface AccountUseCaseAssignRole {
    Account accountAssignRole(long accountId, AccountRole newRole);
}
