package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private HashMap<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public void addEmployee(Employee emp) {
        findInsuranceScheme(emp);
        employeeMap.put(emp.getId(), emp);
    }

    @Override
    public void findInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if (salary > 5000 && salary < 20000 && "System Associate".equalsIgnoreCase(designation)) {
            emp.setInsuranceScheme("Scheme C");
        } else if (salary >= 20000 && salary < 40000 && "Programmer".equalsIgnoreCase(designation)) {
            emp.setInsuranceScheme("Scheme B");
        } else if (salary >= 40000 && "Manager".equalsIgnoreCase(designation)) {
            emp.setInsuranceScheme("Scheme A");
        } else if (salary < 5000 && "Clerk".equalsIgnoreCase(designation)) {
            emp.setInsuranceScheme("No Scheme");
        } else {
            emp.setInsuranceScheme("No Matching Scheme");
        }
    }

    @Override
    public void displayEmployeesByScheme(String scheme) {
        boolean found = false;
        for (Employee emp : employeeMap.values()) {
            if (emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found under " + scheme);
        }
    }

    @Override
    public boolean deleteEmployee(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public HashMap<Integer, Employee> getAllEmployees() {
        return employeeMap;
    }
}
