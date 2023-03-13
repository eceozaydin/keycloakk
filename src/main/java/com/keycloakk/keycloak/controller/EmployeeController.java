package com.keycloakk.keycloak.controller;

import com.keycloakk.keycloak.model.Employee;
import com.keycloakk.keycloak.repository.EmployeeRepository;
import jakarta.annotation.security.RolesAllowed;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee/add")
    //@RolesAllowed("admin")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeRepository.save(employee));
    }

    @GetMapping("/employee")
    //@RolesAllowed({"admin","employee"})
    public ResponseEntity<List<Employee>> getEmployee(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    /*
    @GetMapping("/products")
    public String getProducts(){
        return "prod";
    }
    */

}
