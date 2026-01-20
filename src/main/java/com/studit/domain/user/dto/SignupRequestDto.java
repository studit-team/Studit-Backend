package com.studit.domain.user.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequestDto {
    private String email;
    private String password;
    private String passwordConfirm;
    private String username;
    private String phone;
}