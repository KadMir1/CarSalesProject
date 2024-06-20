package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.PriceHistory;
import ru.samkad.carsalesproject.repository.impl.PriceHistoryRepositoryImpl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
@AllArgsConstructor
public class PriceHistoryRepository implements PriceHistoryRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Set<PriceHistory> getPriceHistoriesByPostId(int id) {
        return new HashSet<>(crudRepository.query("FROM PriceHistory WHERE post_id = :pId",
                PriceHistory.class,
                Map.of("pId", id)));
    }
}
