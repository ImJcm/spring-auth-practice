package com.sparta.springauth.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    //@Email
    @Pattern(regexp = "\\w+@\\w+\\.\\w+(\\.\\w+)?" ,message = "이메일형식이 옳바르지 않습니다.")
    @NotBlank
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}