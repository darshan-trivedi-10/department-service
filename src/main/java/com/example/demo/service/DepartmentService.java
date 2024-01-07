package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);
    public List<Department> fetchDepartments();

    Department getDepartmentsById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long id, Department d);

    Department fetchDepartmentByName(String departmentName);
}
