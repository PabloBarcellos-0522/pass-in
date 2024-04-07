package rocketseat.com.passin.dto.event;

import lombok.Getter;
import rocketseat.com.passin.domain.event.Event;

@Getter
public class EventResponseDTO {

    EventDetailDTO event;

    public EventResponseDTO(Event Event, Integer numberOfAttendees) {
        this.event = new EventDetailDTO(Event.getId(), Event.getTitle(),
                Event.getDetails(), Event.getSlug(),
                Event.getMaximumAttendees(), numberOfAttendees);
    }
}
