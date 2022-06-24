package com.example.sb_nguyenmanhnam.responsitory;

import com.example.sb_nguyenmanhnam.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<EmployeesEntity, Integer> {

}
