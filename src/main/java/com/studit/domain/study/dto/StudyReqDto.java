package com.studit.domain.study.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudyReqDto {

    private int studyId;
    private String leaderId;
    private String studyNm;
    private String studyDc;
    private String category;
    private String mpngSn;
    private int maxMbrNocs;
    private String studyStatusCode;
}
