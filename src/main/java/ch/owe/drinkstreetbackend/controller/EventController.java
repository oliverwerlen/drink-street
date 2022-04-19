package ch.owe.drinkstreetbackend.controller;

import ch.owe.drinkstreetbackend.dto.EventDto;
import ch.owe.drinkstreetbackend.model.Event;
import ch.owe.drinkstreetbackend.service.EventService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/events")
@AllArgsConstructor
@Slf4j
public class EventController {

    private final EventService eventService;
    private final ModelMapper modelMapper;

    @PostMapping
    public EventDto createEvent(@RequestBody EventDto eventDto) {
        log.info(eventDto.toString());
        Event event = modelMapper.map(eventDto, Event.class);
        event = eventService.createEvent(event);
        log.info(event.toString());
        return modelMapper.map(event, EventDto.class);
    }
}
