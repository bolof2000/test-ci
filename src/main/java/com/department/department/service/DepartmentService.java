package com.department.department.service;

import com.department.department.models.Department;
import com.department.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }


    public Department findByDepartmentId(Long departmentId) {

        return departmentRepository.findByDepartmentId(departmentId);
    }
}
