package com.SpringbootAcadamy.department_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    @NotNull(message = "Department id is required")
    private int depid;

    @NotBlank(message = "Department name is required")
    private String depName;

    @NotBlank(message = "Department description is required")
    private String depDestription;

    @NotBlank(message = "Department code is required")
    private String depCode;
}

