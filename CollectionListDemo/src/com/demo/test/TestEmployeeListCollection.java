package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeListCollection {

	public static void main(String[] args) {
		int choise = 0;
		EmployeeService eservice = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add Employee" + "\n2.Delete Employee" + "\n3.Search Emplyee By Id"
					+ "\n4.Search Employee By Name" + "\n5.Display All" + "\n6.Sort By Name" + "\n7.Sort By Department"
					+ "\n8.Modify salary" + "\n9.Exit");
			System.out.println("Enter Choise : ");
			choise = sc.nextInt();
			switch (choise) {
			case 1:
				System.out.println("1.Salaried Employee" + "\n2.Contract Employee");
				System.out.println("Enter Employee Type : ");
				int ch = sc.nextInt();
				eservice.addEmployee(ch);
				break;
			case 2:
				System.out.println("Enter Id : ");
				int pid = sc.nextInt();
				boolean status = eservice.deleteById(pid);
				if (status) {
					System.out.println("Sucessfully Delete");
				} else {
					System.out.println("Not Delete");
				}
				break;
			case 3:
				System.out.println("Enter Id : ");
				pid = sc.nextInt();
				Employee e = eservice.searchById(pid);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Record Not Available!");
				}
				break;
			case 4:
				System.out.println("Enter Name : ");
				String nm = sc.next();
				e = eservice.searchByName(nm);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Record Not Available!");
				}
				break;
			case 5:
				List<Employee> elst = eservice.displyAll();
				for (Employee emp : elst) {
					System.out.println(emp);
				}
				break;
			case 6:
				elst = eservice.sortByName();
				elst.stream().forEach(e1 -> {
					System.out.println(e1);
				});
				break;
			case 7:
				elst = eservice.sortByDept();
				elst.stream().forEach(e2 -> {
					System.out.println(e2);
				});
				break;
			case 8:
				System.out.println("Enter Id : ");
				pid = sc.nextInt();
				System.out.println("Enter New Salary : ");
				double s = sc.nextDouble();
				status = eservice.modifySalary(pid, s);
				if (status) {
					System.out.println("Sucessfully Update Salary");
				} else {
					System.out.println("Not Update salary--Try Again !");
				}
				break;
			case 9:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choise ! Try Again !");
			}

		} while (choise != 8);
	}

}
