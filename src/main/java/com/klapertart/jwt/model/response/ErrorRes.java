package com.klapertart.jwt.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author tritronik
 * @since 9/13/2024
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorRes {
    HttpStatus httpStatus;
    String message;
}