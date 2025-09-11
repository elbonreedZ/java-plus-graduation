package ru.practicum.request.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import ru.practicum.enums.request.RequestStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class ParticipationRequestDto {
    Long id;
    Long requester;
    Long event;
    RequestStatus status;
    LocalDateTime created;
}