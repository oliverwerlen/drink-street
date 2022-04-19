package ch.owe.drinkstreetbackend.service;

import ch.owe.drinkstreetbackend.model.Event;
import ch.owe.drinkstreetbackend.repository.EventRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public Event createEvent(Event event) {
        event.setIdentifier(createIdentifier());
        return eventRepository.save(event);
    }

    private String createIdentifier(){
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}
