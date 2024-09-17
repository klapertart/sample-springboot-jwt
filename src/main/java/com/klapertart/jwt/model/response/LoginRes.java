package com.klapertart.jwt.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tritronik
 * @since 9/13/2024
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRes {
    private String email;
    private String token;
}