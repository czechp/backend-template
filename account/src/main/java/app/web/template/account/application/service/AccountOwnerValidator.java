package app.web.template.account.application.service;

import app.web.template.account.adapter.persistence.AccountRole;
import app.web.template.account.application.dto.AccountQueryDto;
import app.web.template.account.application.port.AccountPortFindByUsername;
import app.web.template.account.domain.Account;
import app.web.template.configuration.security.SecurityCurrentUser;
import app.web.template.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountOwnerValidator {
    private final SecurityCurrentUser securityCurrentUser;
    private final AccountPortFindByUsername accountPortFindByUsername;

    public boolean isAccountOwner(Account account) {
        return validateOwning(account.getUsername());
    }

    public boolean isAccountOwner(AccountQueryDto accountQueryDto) {
        return validateOwning(accountQueryDto.getUsername());
    }

    private boolean validateOwning(String username) {
        final var currentUserAccount = getCurrentUserAccount();
        return currentUserAccount.getUsername().equals(username) || currentUserAccount.getAccountRole().equals(AccountRole.ADMIN);
    }

    private Account getCurrentUserAccount() {
        final var currentUsername = securityCurrentUser.getCurrentUser();
        return accountPortFindByUsername.findAccountByUsername(currentUsername).orElseThrow(() -> new NotFoundException("There is no logged user"));
    }


}
