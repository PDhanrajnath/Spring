package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a query
        Query theQuery = entityManager.createQuery("from Employee");

        //execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        //return the results
        return employees;
    }

    @Override
    public Employee findById(int theId) {

        //create a query for getting employee
        Employee theEmployee = entityManager.find(Employee.class,theId);

        //return results
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {

        //create a query for saving or update ...
        Employee dbEmployee = entityManager.merge(theEmployee);

        //update with id from db ..so we can get generated id
        theEmployee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteById(int theId) {

        //delete object with primary key
        Query theQuery = entityManager.createQuery("delete from Employee where id=:empId");
        theQuery.setParameter("empId",theId);
        theQuery.executeUpdate();
    }
}
