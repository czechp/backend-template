package app.web.orders.user.event;

import app.web.orders.domainDrivenDesign.annotation.DomainEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;

@DomainEvent
@Getter
@AllArgsConstructor
public class UserConfirmedByAdmin {
    private final boolean confirmedByAdmin;


}
