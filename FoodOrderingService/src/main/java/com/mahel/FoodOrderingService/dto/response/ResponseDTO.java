package com.mahel.FoodOrderingService.dto.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseDTO<T> {
    private HttpStatus httpStatus;
    private String code;
    private String message;
    private T payload;
}
