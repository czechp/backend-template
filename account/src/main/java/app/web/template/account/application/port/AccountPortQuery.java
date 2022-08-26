package app.web.template.account.application.port;

import app.web.template.account.application.dto.AccountQueryDto;
import app.web.template.account.application.dto.AccountUserDetailsDto;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AccountPortQuery {
    List<AccountQueryDto> findAllAccountQuery(Pageable pageable);

    Optional<AccountQueryDto> findAccountByIdQuery(long accountId);

    Optional<AccountUserDetailsDto> findAccountByUsername(String username);

}
