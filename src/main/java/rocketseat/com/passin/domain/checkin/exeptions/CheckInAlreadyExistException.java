package rocketseat.com.passin.domain.checkin.exeptions;

public class CheckInAlreadyExistException extends RuntimeException {

    public CheckInAlreadyExistException(String message) {
        super(message);
    }
}
