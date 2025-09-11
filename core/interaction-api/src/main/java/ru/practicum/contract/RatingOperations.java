package ru.practicum.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RatingOperations {

    @GetMapping
    List<Long> getMostLikedEventIds(@RequestParam int limit);
}
