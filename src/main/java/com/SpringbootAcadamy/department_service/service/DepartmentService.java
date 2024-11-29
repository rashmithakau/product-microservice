package com.SpringbootAcadamy.department_service.service;

import com.SpringbootAcadamy.department_service.dto.DepartmentDto;
import com.SpringbootAcadamy.department_service.entity.Department;

public interface DepartmentService {
    Department saveDepartment(DepartmentDto department);
}
