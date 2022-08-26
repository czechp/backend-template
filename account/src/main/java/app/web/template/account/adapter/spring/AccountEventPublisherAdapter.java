package app.web.template.account.adapter.spring;

import app.web.template.account.application.port.AccountPortEmitDeleteEvent;
import app.web.template.account.domain.Account;
import app.web.template.account.event.AccountDeleteEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class AccountEventPublisherAdapter implements AccountPortEmitDeleteEvent {
    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void emitAccountDeleteEvent(Account account) {
        AccountDeleteEvent accountDeleteEvent = new AccountDeleteEvent(this, account.getId());
        applicationEventPublisher.publishEvent(accountDeleteEvent);
    }
}
