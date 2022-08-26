package app.web.template.account.adapter.rest;

import app.web.template.account.application.dto.AccountUserDetailsDto;
import app.web.template.account.application.query.AccountQueryExternalAuthentication;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/external-login")
@CrossOrigin("*")
@AllArgsConstructor
class AccountRestAdapterExternalLogin {
    private final AccountQueryExternalAuthentication accountQueryExternalAuthentication;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    AccountUserDetailsDto authenticateExternalSystems() {
        return accountQueryExternalAuthentication.authenticateCurrentUser();
    }
}
