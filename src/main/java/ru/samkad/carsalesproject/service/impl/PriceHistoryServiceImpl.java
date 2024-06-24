package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.PriceHistory;

import java.util.Set;

public interface PriceHistoryServiceImpl {
    Set<PriceHistory> getPriceHistoriesByPostId(int id);
}
