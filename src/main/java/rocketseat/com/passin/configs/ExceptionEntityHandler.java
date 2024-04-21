package rocketseat.com.passin.configs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import rocketseat.com.passin.domain.attendee.exeptions.AttendeeAlreadyExistException;
import rocketseat.com.passin.domain.attendee.exeptions.AttendeeNotFoundException;
import rocketseat.com.passin.domain.checkin.exeptions.CheckInAlreadyExistException;
import rocketseat.com.passin.domain.event.exeptions.EventFullException;
import rocketseat.com.passin.domain.event.exeptions.EventNotFoundException;

@ControllerAdvice
public class ExceptionEntityHandler {

    @ExceptionHandler(EventNotFoundException.class)
    public ResponseEntity handlerEventNotFound(EventNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(EventFullException.class)
    public ResponseEntity handlerEventNotFound(EventFullException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

    @ExceptionHandler(AttendeeNotFoundException.class)
    public ResponseEntity handlerAttendeeNotFound(AttendeeNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(AttendeeAlreadyExistException.class)
    public ResponseEntity handlerAttendeeAlreadyExist(AttendeeAlreadyExistException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }

    @ExceptionHandler(CheckInAlreadyExistException.class)
    public ResponseEntity handlerCheckInAlreadyExist(CheckInAlreadyExistException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}
