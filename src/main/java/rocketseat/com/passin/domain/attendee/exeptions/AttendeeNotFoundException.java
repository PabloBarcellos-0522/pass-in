package rocketseat.com.passin.domain.attendee.exeptions;

public class AttendeeNotFoundException extends RuntimeException{
    public AttendeeNotFoundException(String message) {super(message);}
}
