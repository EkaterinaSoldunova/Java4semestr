package com.java_mirea.pract16.service;

import com.java_mirea.pract16.repository.ManufactureRepository;
import com.java_mirea.pract16.entity.Manufacture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
public class ManufactureService {
    @Autowired
    ManufactureRepository repository;

    public void setRepository(ManufactureRepository repository) {
        this.repository = repository;
    }

    @Transactional() //21
    public Manufacture getManu(Long id){ //18
        log.info("get Manufacture with id= {}",id); //19
        return repository.findById(id).get(); //18
    }
}
