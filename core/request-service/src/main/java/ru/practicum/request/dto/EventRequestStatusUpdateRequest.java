package ru.practicum.request.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
public class EventRequestStatusUpdateRequest {
    private List<Long> requestIds;
    private Status status;

    public enum Status {
        CONFIRMED,
        REJECTED
    }
}
