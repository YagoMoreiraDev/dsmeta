package com.yagodev.dsmeta.services;

import com.yagodev.dsmeta.entities.Sales;
import com.yagodev.dsmeta.repositories.SalesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    private SalesRepository repository;

    public SalesService(SalesRepository repository) {
        this.repository = repository;
    }

    public List<Sales> findSales(){
        return repository.findAll();
    }
}
