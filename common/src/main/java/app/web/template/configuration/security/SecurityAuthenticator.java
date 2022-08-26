package app.web.template.configuration.security;

import app.web.template.configuration.security.dto.SecurityLoginQueryDto;

public interface SecurityAuthenticator {
    SecurityLoginQueryDto authenticateAccount(String username, String password);

}
