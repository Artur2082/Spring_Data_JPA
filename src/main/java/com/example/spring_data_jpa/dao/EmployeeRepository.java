package com.example.spring_data_jpa.dao;


import com.example.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAll();

  public void saveEmp(Employee employee);

  public Employee getEmp(int id);
  public void deleteEmp(int id);

}
