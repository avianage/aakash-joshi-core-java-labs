package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.HashMap;

public interface EmployeeService {
    void addEmployee(Employee emp);
    void findInsuranceScheme(Employee emp);
    void displayEmployeesByScheme(String scheme);
    boolean deleteEmployee(int id);
    HashMap<Integer, Employee> getAllEmployees();
}
