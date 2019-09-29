package org.serious.labs.simple.restful.api.resource;

import org.serious.labs.simple.restful.api.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
