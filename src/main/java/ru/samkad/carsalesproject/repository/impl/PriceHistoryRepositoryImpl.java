package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.PriceHistory;

import java.util.Set;

public interface PriceHistoryRepositoryImpl {

    Set<PriceHistory> getPriceHistoriesByPostId(int id);
}
