package com.keycloakk.keycloak.repository;

import com.keycloakk.keycloak.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, UUID> {


}
