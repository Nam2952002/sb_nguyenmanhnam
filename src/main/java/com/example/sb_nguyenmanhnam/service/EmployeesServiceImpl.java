package com.example.sb_nguyenmanhnam.service;

import com.example.sb_nguyenmanhnam.entity.EmployeesEntity;
import com.example.sb_nguyenmanhnam.responsitory.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    EmployeesRepo employeesRepo;

    @Override
    public List<EmployeesEntity> findAllEmployees() {
        return employeesRepo.findAll();
    }

    @Override
    public EmployeesEntity createEmployees(EmployeesEntity employees) {
        return employeesRepo.save(employees);
    }
}
