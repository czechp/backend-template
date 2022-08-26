package app.web.template.account.application.query;

import app.web.template.account.application.dto.AccountQueryDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountQuery {
    AccountQueryDto findAccountById(long accountId);

    List<AccountQueryDto> findAccountsAll(Pageable pageable);

}
