package app.web.template.exception;

public class NotEnoughPrivilegesException extends RuntimeException {
    public NotEnoughPrivilegesException(String message) {
        super(message);
    }
}
