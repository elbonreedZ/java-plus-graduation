package ru.practicum.event.service;

import org.springframework.data.domain.Pageable;
import ru.practicum.dto.StatDto;
import ru.practicum.event.dto.*;
import ru.practicum.event.model.Event;

import java.util.List;

public interface EventService {
    EventFullDto add(EventNewDto newEvent, long userId);

    List<EventShortDto> getAllByUser(long userId, Pageable pageable);

    EventFullDto getByIdPrivate(long eventId, long userId);

    EventFullDto updatePrivate(long userId, long eventId, EventUserUpdateDto eventUpdate);

    EventFullDto updateAdmin(long eventId, EventAdminUpdateDto eventUpdate);

    List<EventFullDto> getAllByAdmin(EventAdminParam params);

    List<EventShortDto> getAllPublic(EventPublicParam params);

    EventFullDto getByIdPublic(long eventId, StatDto statDto);
    List<EventShortDto> getShortEvents(List<Event> events);
    List<Event> getAllByIds(List<Long> eventsIds);

}
