package com.example.RegisterLogIn.EmployeeController;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeID){
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
}
