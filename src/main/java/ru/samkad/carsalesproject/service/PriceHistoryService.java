package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.PriceHistory;
import ru.samkad.carsalesproject.repository.impl.PriceHistoryRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.PriceHistoryServiceImpl;

import java.util.Set;

@Service
@AllArgsConstructor
public class PriceHistoryService implements PriceHistoryServiceImpl {

    private final PriceHistoryRepositoryImpl priceHistoryRepository;

    @Override
    public Set<PriceHistory> getPriceHistoriesByPostId(int id) {
        return priceHistoryRepository.getPriceHistoriesByPostId(id);
    }
}
