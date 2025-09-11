package ru.practicum.rating.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.practicum.rating.repository.RatingRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RatingInternalServiceImpl implements RatingInternalService {

    private final RatingRepository ratingRepository;
    @Override
    public List<Long> getMostLikedEventIds(int limit) {
        return ratingRepository.findMostLikedEvents(PageRequest.of(0, limit));
    }
}
