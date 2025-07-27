package com.example.backend.domain.auth.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SigninRequest {

    private String email;
    private String password;
}
