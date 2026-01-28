package com.studit.domain.study.dto.study;

import lombok.Data;

import java.util.List;

@Data
public class StudyCreateDto {

    //스터디 기본  변수
    private int studyId;
    private String leaderId;
    private String studyNm;
    private String studyDc;
    private String mpngSn;
    private int maxMbrNocs;
    private String studyStatusCode;

    // 스터디 카테고리, 요일 변수
    private List<String> categoryIds;
    private List<String> dayIds;

    // 스터디 최초 생성 시 금액 관련 변수
    private List<FeeDto> fees;

    // 스터디 멤버
    private String roleCode;



}
