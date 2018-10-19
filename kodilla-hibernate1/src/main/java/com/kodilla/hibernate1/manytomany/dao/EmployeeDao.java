package com.kodilla.hibernate1.manytomany.dao;

import com.kodilla.hibernate1.manytomany.Company;
import com.kodilla.hibernate1.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retrieveEmployeeWithName(@Param("FIRSTNAME") String firstname);

    @Query(nativeQuery = true)
    List<Employee> retrieveEmployeeWithNameContaining(@Param("LETTERS") String letters);
}