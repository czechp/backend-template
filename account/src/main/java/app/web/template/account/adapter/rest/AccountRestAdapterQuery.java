package app.web.template.account.adapter.rest;

import app.web.template.account.application.dto.AccountQueryDto;
import app.web.template.account.application.query.AccountQuery;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/accounts")
@CrossOrigin("*")
class AccountRestAdapterQuery {
    private final AccountQuery accountQuery;

    @Secured({"ROLE_ADMIN"})
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<AccountQueryDto> findAccountsAll(Pageable pageable) {
        return accountQuery.findAccountsAll(pageable);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    AccountQueryDto findAccountById(@PathVariable(name = "id") long accountId) {
        return accountQuery.findAccountById(accountId);
    }
}
