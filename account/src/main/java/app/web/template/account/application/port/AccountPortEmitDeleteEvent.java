package app.web.template.account.application.port;

import app.web.template.account.domain.Account;

public interface AccountPortEmitDeleteEvent {
    void emitAccountDeleteEvent(Account account);
}
