package microunit;

import org.tinylog.Logger;

/**
 * Thrown when a unit test class does not conform to the requirements, e.g.,
 * it does not have a public no-argument constructor.
 */
public class InvalidTestClassException extends RuntimeException {

    public InvalidTestClassException(String message) {

        super(message);
        Logger.error("Throw InvalidTestClassException");
    }

    public InvalidTestClassException(Throwable cause) {
        super(cause);
        Logger.error("Throw InvalidTestClassException");
    }

    public InvalidTestClassException(String message, Throwable cause) {
        super(message, cause);
        Logger.error("Throw InvalidTestClassException");
    }

}
