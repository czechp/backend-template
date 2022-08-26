package app.web.template.account.application.query;

import app.web.template.account.application.dto.AccountQueryDto;
import app.web.template.account.application.port.AccountPortQuery;
import app.web.template.account.application.service.AccountOwnerValidator;
import app.web.template.exception.NotEnoughPrivilegesException;
import app.web.template.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
class AccountQueryImpl implements AccountQuery {
    private final AccountPortQuery accountPortQuery;
    private final AccountOwnerValidator accountOwnerValidator;

    @Override
    public AccountQueryDto findAccountById(long accountId) {
        final var accountQueryDto = accountPortQuery.findAccountByIdQuery(accountId)
                .orElseThrow(() -> new NotFoundException("There is no account with id:" + accountId));
        if (accountOwnerValidator.isAccountOwner(accountQueryDto))
            return accountQueryDto;
        else throw new NotEnoughPrivilegesException("You are not owner of account");
    }

    @Override
    public List<AccountQueryDto> findAccountsAll(Pageable pageable) {
        return accountPortQuery.findAllAccountQuery(pageable);
    }

}
