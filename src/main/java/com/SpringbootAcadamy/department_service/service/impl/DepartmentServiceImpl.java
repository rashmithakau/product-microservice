package com.SpringbootAcadamy.department_service.service.impl;

import com.SpringbootAcadamy.department_service.dto.DepartmentDto;
import com.SpringbootAcadamy.department_service.entity.Department;
import com.SpringbootAcadamy.department_service.repository.DepartmentRepository;
import com.SpringbootAcadamy.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(DepartmentDto department) {
        Department department_=modelMapper.map(department,Department.class);
        return departmentRepository.save(department_);

    }
}
