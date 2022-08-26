package app.web.template.account.application.port;

import app.web.template.account.domain.Account;

import java.util.Optional;

public interface AccountPortFindByUsernameOrEmail {
    Optional<Account> findAccountByUsernameOrEmail(String username, String email);
}
