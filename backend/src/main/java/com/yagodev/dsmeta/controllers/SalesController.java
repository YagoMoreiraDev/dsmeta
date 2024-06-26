package com.yagodev.dsmeta.controllers;

import com.yagodev.dsmeta.entities.Sales;
import com.yagodev.dsmeta.services.SalesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    private SalesService service;

    public SalesController(SalesService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Sales> findAllSales(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                                 @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                                 Pageable pageable){

        return service.findAllSales(minDate, maxDate, pageable);
    }
}
