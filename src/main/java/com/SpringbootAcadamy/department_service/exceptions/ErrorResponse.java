package com.SpringbootAcadamy.department_service.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private final Integer error;
    private final String message;
}
