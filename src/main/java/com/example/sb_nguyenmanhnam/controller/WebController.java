package com.example.sb_nguyenmanhnam.controller;


import com.example.sb_nguyenmanhnam.entity.EmployeesEntity;
import com.example.sb_nguyenmanhnam.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {
    @Autowired
    EmployeesService employeesService;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        List<EmployeesEntity> employeesEntities = employeesService.findAllEmployees();
        model.addAttribute("employees", employeesEntities);
        return "index";
    }

    @PostMapping("/create")
    public String createEmployees(Model model, @RequestParam Map<String, String> params){
        System.out.println(params);
        String name = params.get("name");
        String wage = params.get("wage");
        EmployeesEntity employees = new EmployeesEntity(name, Integer.valueOf(wage));
        employeesService.createEmployees(employees);
        return "redirect:/index";
    }

}
