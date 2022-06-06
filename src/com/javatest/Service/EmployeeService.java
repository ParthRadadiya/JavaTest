package com.javatest.Service;

import java.util.ArrayList;
import java.util.List;

import com.javatest.dto.Employee;

public class EmployeeService {

	List<Employee> employees = new ArrayList<>();

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) throws Exception {
		checkEmployeeExist(employee);
		employees.remove(employee);
	}

	public void updateEmployee(Employee employee) throws Exception {
		checkEmployeeExist(employee);
		int index = employees.indexOf(employee);
		employees.set(index, employee);
	}

	public List<Employee> getAllEmployees() {
		return employees;
	}

	public void checkEmployeeExist(Employee employeeObj) throws Exception {
		boolean found = employees.stream()
		.anyMatch(employee -> Long.toString(employee.getId()).equals(Long.toString(employeeObj.getId())));
		if (!found) {
			throw new Exception(String.format("Employee does't exist of employeeId: %s", employeeObj.getId()));
		}
	}
}
