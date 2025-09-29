package ru.practicum.stats.analyzer.dal.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@Table(name = "event_similarity", schema = "stats_analyzer")
public class EventSimilarity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "event_a")
    private long eventA;
    @Column(name = "event_b")
    private long eventB;
    private double score;
}
