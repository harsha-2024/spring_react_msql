package com.ems.EMS.repository;

import com.ems.EMS.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// public class EmployeeRepository {

// }

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}