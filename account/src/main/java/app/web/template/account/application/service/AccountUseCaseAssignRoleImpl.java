package app.web.template.account.application.service;

import app.web.template.account.adapter.persistence.AccountRole;
import app.web.template.account.application.port.AccountPortFindById;
import app.web.template.account.application.port.AccountPortSave;
import app.web.template.account.application.useCase.AccountUseCaseAssignRole;
import app.web.template.account.domain.Account;
import app.web.template.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
class AccountUseCaseAssignRoleImpl implements AccountUseCaseAssignRole {
    private final AccountPortFindById accountPortFindById;
    private final AccountPortSave accountPortSave;

    @Override
    @Transactional
    public Account accountAssignRole(long accountId, AccountRole newRole) {
        Account account = accountPortFindById.findAccountById(accountId)
                .orElseThrow(() -> new NotFoundException("Account with id: " + accountId + " not exists"));
        account.assignRole(newRole);
        accountPortSave.saveAccount(account);
        return account;
    }
}
