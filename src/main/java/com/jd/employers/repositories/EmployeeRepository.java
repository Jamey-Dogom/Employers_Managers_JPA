package com.jd.employers.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jd.employers.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
