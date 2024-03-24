package com.yagodev.dsmeta.services;

import com.yagodev.dsmeta.entities.Sales;
import com.yagodev.dsmeta.repositories.SalesRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class SalesService {
    private SalesRepository repository;

    public SalesService(SalesRepository repository) {
        this.repository = repository;
    }

    public Page<Sales> findAllSales(String minDate, String maxDate, Pageable pageable){
        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.isEmpty() ? today.minusDays(365) :LocalDate.parse(minDate);
        LocalDate max = maxDate.isEmpty() ? today : LocalDate.parse(maxDate);

        return repository.findAllSales(min, max, pageable);
    }
}
