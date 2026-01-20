package com.studit.domain.user.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserLgnHstryDto {
    private Long lgnId;
    private String userId;
    private LocalDateTime lgnDate;
    private String lgnIp;
    private String lgnSttus;
}