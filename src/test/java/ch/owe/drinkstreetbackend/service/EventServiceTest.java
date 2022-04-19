package ch.owe.drinkstreetbackend.service;


import ch.owe.drinkstreetbackend.model.Event;
import ch.owe.drinkstreetbackend.repository.EventRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class EventServiceTest {

    @Mock
    EventRepository eventRepository;

    @Test
    public void givenEvent_whenSaveEvent_thenReturnEvent(){
        Event event = Event.builder().id(1L).name("DemoEvent").build();

        given(eventRepository.save(event)).willReturn(event);

        Event eventSaved = eventRepository.save(event);
        assertThat(eventSaved).isNotNull();
    }

}
