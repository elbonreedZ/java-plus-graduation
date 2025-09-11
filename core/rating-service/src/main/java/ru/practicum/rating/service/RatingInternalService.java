package ru.practicum.rating.service;

import java.util.List;

public interface RatingInternalService {
    List<Long> getMostLikedEventIds(int limit);
}
