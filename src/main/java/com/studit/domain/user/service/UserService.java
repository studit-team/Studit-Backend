package com.studit.domain.user.service;


import com.studit.domain.user.dto.SignupRequestDto;
import com.studit.domain.user.dto.UserDTO;
import com.studit.domain.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    /**
     * 이메일 중복 확인
     */
    public boolean existsByEmail(String email) {
        UserDTO user = userMapper.findByEmail(email);
        return user != null;
    }

    /**
     * 회원가입
     */
    @Transactional
    public void signup(SignupRequestDto signupRequest) {
        // 1. 보안 설정 ID 생성
        String securityId = UUID.randomUUID().toString();

        // 2. 보안 설정 삽입 (기본 권한: USER)
        userMapper.insertUserScrtyEstbs(securityId, "GENERAL", "USER");

        // 3. 사용자 정보 생성
        UserDTO userInfo = UserDTO.builder()
                .userId(UUID.randomUUID().toString())
                .username(signupRequest.getUsername() != null ? signupRequest.getUsername() : signupRequest.getEmail().split("@")[0])
                .password(passwordEncoder.encode(signupRequest.getPassword()))
                .email(signupRequest.getEmail())
                .phone(signupRequest.getPhone())
                .userSttusCode("ACTIVE")
                .sbscrbBe(LocalDateTime.now())
                .lgnAprvYn("Y")
                .lgnFailNocs(0)
                .sctryDtrmnTrgetId(securityId)
                .build();

        // 4. 사용자 정보 삽입
        userMapper.insertUserInfo(userInfo);
    }
}