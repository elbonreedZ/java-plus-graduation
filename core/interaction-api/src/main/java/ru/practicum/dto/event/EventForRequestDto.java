package ru.practicum.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.practicum.enums.event.EventState;

@Data
@Builder
@AllArgsConstructor
public class EventForRequestDto {
    Long id;
    Long initiatorId;
    Integer participantLimit;
    EventState state;
    Boolean requestModeration;
}
