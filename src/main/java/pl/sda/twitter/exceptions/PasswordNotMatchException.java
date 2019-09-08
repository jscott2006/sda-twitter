package pl.sda.twitter.exceptions;

public class PasswordNotMatchException extends IllegalStateException {

    public PasswordNotMatchException(String message) {
        super(message);
    }

}
