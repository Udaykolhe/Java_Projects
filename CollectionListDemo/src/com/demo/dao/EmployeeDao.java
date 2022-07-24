package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {

	void save(Employee obj);

	List<Employee> findAll();

	Employee searchById(int pid);

	Employee searchByName(String nm);

	boolean modifySalary(int pid, double s);

	boolean deleteById(int pid);

	List<Employee> sortByName();

	List<Employee> sortByDept();

}
