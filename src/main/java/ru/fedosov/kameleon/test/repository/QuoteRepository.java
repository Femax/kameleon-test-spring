package ru.fedosov.kameleon.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.fedosov.kameleon.test.model.Quote;

public interface QuoteRepository extends PagingAndSortingRepository<Quote, Long> {
    Quote save(Quote quote);
}