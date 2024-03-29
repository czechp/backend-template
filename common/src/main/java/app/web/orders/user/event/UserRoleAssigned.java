package app.web.orders.user.event;

import app.web.orders.domainDrivenDesign.annotation.DomainEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;

@DomainEvent
@AllArgsConstructor
@Getter
public class UserRoleAssigned {
    private final String newRole;
}
