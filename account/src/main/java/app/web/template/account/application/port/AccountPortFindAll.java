package app.web.template.account.application.port;

import app.web.template.account.domain.Account;

import java.util.List;

public interface AccountPortFindAll {
    List<Account> findAllAccounts();
}
