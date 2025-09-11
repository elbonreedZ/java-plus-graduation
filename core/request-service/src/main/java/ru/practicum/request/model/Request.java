package ru.practicum.request.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.enums.request.RequestStatus;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "requests", schema = "core_requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    RequestStatus status;

    @Column(name = "created", nullable = false)
    LocalDateTime created;

    @Column(name = "requester_id")
    long requesterId;

    @Column(name = "event_id")
    long eventId;
}
