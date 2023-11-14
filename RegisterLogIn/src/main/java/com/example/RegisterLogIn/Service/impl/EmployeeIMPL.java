package com.example.RegisterLogIn.Service.impl;

import com.example.RegisterLogIn.Dto.EmployeeDTO;
import com.example.RegisterLogIn.Repo.EmployeeRepo;
import com.example.RegisterLogIn.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        return null;
    }
}
