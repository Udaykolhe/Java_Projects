package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {

		this.employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person_Id : ");
		int pid = sc.nextInt();
		System.out.println("Enter the Name : ");
		String name = sc.next();
		System.out.println("Enter the Mobile_No : ");
		String mobileno = sc.next();
		System.out.println("Enter the Email Id : ");
		String emailid = sc.next();
		System.out.println("Enter the Department : ");
		String dept = sc.next();
		System.out.println("Enter the Designation : ");
		String desg = sc.next();
		if (ch == 1) {
			System.out.println("Enter Salary : ");
			double sal = sc.nextDouble();
			System.out.println("Enter Bonus : ");
			double bonus = sc.nextDouble();
			employeeDao.save(new SalariedEmp(pid, name, mobileno, emailid, dept, desg, sal, bonus));

		} else {
			System.out.println("Enter hours Charges : ");
			int hr_charges = sc.nextInt();
			System.out.println("Enter No of hours work : ");
			int no_hrs_worked = sc.nextInt();
			employeeDao.save(new ContractEmp(pid, name, mobileno, emailid, dept, desg, hr_charges, no_hrs_worked));

		}

	}

	@Override
	public Employee searchById(int pid) {
		return employeeDao.searchById(pid);

	}

	@Override
	public Employee searchByName(String nm) {
		return employeeDao.searchByName(nm);
	}

	@Override
	public List<Employee> displyAll() {
		return employeeDao.findAll();
	}

	@Override
	public boolean modifySalary(int pid, double s) {
		return employeeDao.modifySalary(pid, s);

	}

	@Override
	public boolean deleteById(int pid) {
		return employeeDao.deleteById(pid);
	}

	@Override
	public List<Employee> sortByName() {
		return employeeDao.sortByName();
	}

	@Override
	public List<Employee> sortByDept() {
		return employeeDao.sortByDept();
	}

}
