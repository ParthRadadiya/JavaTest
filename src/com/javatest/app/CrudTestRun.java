package com.javatest.app;

import java.util.List;

import com.javatest.Service.EmployeeService;
import com.javatest.dto.Employee;

public class CrudTestRun {

	public static void main(String[] args) throws Exception {
		EmployeeService employeeService = new EmployeeService();
		employeeService.addEmployee(new Employee(1, "Parth", "Java"));
		employeeService.addEmployee(new Employee(2, "Aman", "QA"));
		employeeService.addEmployee(new Employee(3, "Pravin", "BA"));

		List<Employee> allEmployees = employeeService.getAllEmployees();
		allEmployees.forEach(employee -> System.out.println(employee));

		Employee employee = new Employee(1, "Jay", "Java");
		employeeService.updateEmployee(employee);

		allEmployees = employeeService.getAllEmployees();
		System.out.println("Updated List : ");
		allEmployees.forEach(employee1 -> System.out.println(employee1));
		
		System.out.println("Remove the Employee");
		employeeService.removeEmployee(new Employee(1, "Jay", "Java"));
		allEmployees = employeeService.getAllEmployees();
		allEmployees.forEach(employee1 -> System.out.println(employee1));
	}
}
