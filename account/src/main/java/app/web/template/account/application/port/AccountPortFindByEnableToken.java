package app.web.template.account.application.port;

import app.web.template.account.domain.Account;

import java.util.Optional;

public interface AccountPortFindByEnableToken {
    Optional<Account> findAccountByEnableToken(String enableToken);
}
