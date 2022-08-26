package app.web.template.account;

import app.web.template.account.dto.AccountFacadeDto;

import java.util.Optional;

public interface AccountFacade {
    Optional<AccountFacadeDto> findCurrentUserAccount();

    Optional<AccountFacadeDto> findAccountByUsername(String username);
}
