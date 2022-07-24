package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
	}

	@Override
	public void save(Employee obj) {
		elist.add(obj);

	}

	@Override
	public boolean deleteById(int pid) {
		Scanner sc = new Scanner(System.in);
		Employee e = searchById(pid);
		if (e != null) {
			System.out.println(e);
			System.out.println("Do you want to Delete details y/n");
			String ans = sc.next();
			if (ans.equals("y")) {
				return elist.remove(new Employee(pid));
			}
		}
		return false;

	}

// Display Method
	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public Employee searchById(int pid) {
		Employee e = new Employee(pid);
		int pos = elist.indexOf(e);
		if (pos != -1) {
			return elist.get(pos);
		} else {
			return null;
		}
	}

	@Override
	public Employee searchByName(String nm) {
		for (Employee e : elist) {
			if (e.getName().equals(nm)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public boolean modifySalary(int pid, double s) {
		Employee e = searchById(pid);
		if (e != null) {
			if (e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(s);
				return true;
			} else {
				((ContractEmp) e).setHr_charges(s);
				return true;
			}

		}
		return false;
	}

	Comparator<Employee> ncomparator = (obj1, obj2) -> {
		return (obj1.getName().compareTo(obj2.getName()));
	};

	@Override
	public List<Employee> sortByName() {
		Collections.sort(elist, ncomparator);
		return elist;
	}

	Comparator<Employee> dcomparator = (obj1, obj2) -> 
	{return (obj1.getDept().compareTo(obj2.getDept()));};

	@Override
	public List<Employee> sortByDept() {
		Collections.sort(elist, dcomparator);
		return elist;
	}

}
