package ru.practicum.stats.analyzer.handler;

import ru.practicum.ewm.stats.avro.EventSimilarityAvro;

public interface SimilarityHandler {
    void handle(EventSimilarityAvro eventSimilarityAvro);
}
