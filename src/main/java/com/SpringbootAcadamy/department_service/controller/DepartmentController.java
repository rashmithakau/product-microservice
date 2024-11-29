package com.SpringbootAcadamy.department_service.controller;

import com.SpringbootAcadamy.department_service.dto.DepartmentDto;
import com.SpringbootAcadamy.department_service.entity.Department;
import com.SpringbootAcadamy.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/department")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody DepartmentDto department) {
        Department department1=departmentService.saveDepartment(department);
        return new ResponseEntity<>(department1, HttpStatus.CREATED);
    }
}
