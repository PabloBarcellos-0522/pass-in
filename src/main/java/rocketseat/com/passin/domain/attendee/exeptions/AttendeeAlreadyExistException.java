package rocketseat.com.passin.domain.attendee.exeptions;

public class AttendeeAlreadyExistException extends RuntimeException {

    public AttendeeAlreadyExistException(String message) {
        super(message);
    }
}
