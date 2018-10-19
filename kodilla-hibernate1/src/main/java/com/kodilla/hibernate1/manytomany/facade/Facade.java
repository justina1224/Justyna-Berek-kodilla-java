package com.kodilla.hibernate1.manytomany.facade;

import com.kodilla.hibernate1.manytomany.Company;
import com.kodilla.hibernate1.manytomany.Employee;
import com.kodilla.hibernate1.manytomany.dao.CompanyDao;
import com.kodilla.hibernate1.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public Facade() {}

    public List<Employee> findEmployeesWithNameContaining(String letters) {
        LOGGER.info("Searching employees with lastname containing: " + letters + "...");
        String partOfName = "%" + letters + "%";
        List<Employee> newList = employeeDao.retrieveEmployeeWithNameContaining(partOfName);
        if(newList.size() == 0) {
            LOGGER.info("There's no employee with lastname containing: " + letters);
        } else {
            LOGGER.info("Found " + newList.size() + (newList.size() == 1 ? " employee" : " employees"));
        }

        return newList;
    }

    public List<Company> findCompaniesWithNameContaining(String letters) {
        LOGGER.info("Searching companies with name containing :" + letters + "...");
        String partOfName = "%" + letters + "%";
        List<Company> newList = companyDao.retrieveCompanyWithNameContaining(partOfName);
        if(newList.size() == 0) {
            LOGGER.info("There's no company with name containing :" + letters);
        }
        LOGGER.info("Found " + newList.size() + (newList.size()==1?" company":" companies"));

        return newList;
    }

}
