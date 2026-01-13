package com.studit.domain.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Study {

    private int studyId;
    private String leaderId;
    private String studyNm;
    private String studyDc;
    private String category;
    private String mpngSn;
    private int maxMbrNocs;
    private String studyStatusCode;

}
