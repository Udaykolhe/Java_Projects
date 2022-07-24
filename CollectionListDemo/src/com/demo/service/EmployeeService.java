package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	void addEmployee(int ch);

	List<Employee> displyAll();

	Employee searchById(int pid);

	Employee searchByName(String nm);

	boolean modifySalary(int pid, double s);

	boolean deleteById(int pid);

	List<Employee> sortByName();

	List<Employee> sortByDept();

}
