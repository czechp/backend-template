package app.web.template.account.application.query;

import app.web.template.account.application.dto.AccountUserDetailsDto;

public interface AccountQueryExternalAuthentication {
    AccountUserDetailsDto authenticateCurrentUser();
}
