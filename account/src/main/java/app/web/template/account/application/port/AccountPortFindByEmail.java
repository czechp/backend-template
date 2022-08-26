package app.web.template.account.application.port;

import app.web.template.account.domain.Account;

import java.util.Optional;

public interface AccountPortFindByEmail {
    Optional<Account> findAccountByEmail(String email);
}
