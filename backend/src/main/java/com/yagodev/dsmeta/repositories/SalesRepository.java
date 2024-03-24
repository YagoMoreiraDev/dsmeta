package com.yagodev.dsmeta.repositories;

import com.yagodev.dsmeta.entities.Sales;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

@Repository
public interface SalesRepository extends PagingAndSortingRepository<Sales, Long> {
    @Query("SELECT obj FROM Sales obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<Sales> findAllSales(LocalDate min, LocalDate max, Pageable pageable);
}