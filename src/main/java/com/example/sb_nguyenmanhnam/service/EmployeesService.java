package com.example.sb_nguyenmanhnam.service;

import com.example.sb_nguyenmanhnam.entity.EmployeesEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeesService {
    EmployeesEntity createEmployees(EmployeesEntity employees);

    List<EmployeesEntity> findAllEmployees();

}
