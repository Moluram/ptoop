package by.bsuir.fksis.info.ptoop.exception;

/**
 * Package not found Exception
 */
public class PackageNotFoundException extends RuntimeException {
    public PackageNotFoundException() {
        super();
    }

    public PackageNotFoundException(String message) {
        super(message);
    }

    public PackageNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PackageNotFoundException(Throwable cause) {
        super(cause);
    }

    protected PackageNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
