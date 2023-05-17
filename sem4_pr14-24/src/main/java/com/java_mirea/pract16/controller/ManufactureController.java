package com.java_mirea.pract16.controller;

import com.java_mirea.pract16.repository.ManufactureRepository;
import com.java_mirea.pract16.entity.Manufacture;
import com.java_mirea.pract16.entity.Phone;
import com.java_mirea.pract16.service.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManufactureController {
    private final ManufactureRepository repository;
    @Autowired
    PhoneServiceImpl repository1;

    public ManufactureController(ManufactureRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/manufacture/{manuId}")
    public Manufacture getManufacture(@PathVariable("manuId") Long id) {
        return repository.findById(id).get();
    }

    @GetMapping("/phone/{id}")
    public List<Phone> getPhones(){
        return repository1.getFilterPhone();
    }

}
