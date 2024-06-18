package com.example.clientes_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse <T>{
    private String status;
    private String message;
    private Object result;

}
