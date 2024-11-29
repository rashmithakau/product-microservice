package com.SpringbootAcadamy.department_service.repository;

import com.SpringbootAcadamy.department_service.dto.DepartmentDto;
import com.SpringbootAcadamy.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
