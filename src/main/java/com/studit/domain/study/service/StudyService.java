package com.studit.domain.study.service;

import com.studit.domain.study.dto.StudyRespDto;
import com.studit.domain.study.entity.Study;
import com.studit.domain.study.repository.StudyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyService {

    @Autowired
    public StudyMapper studyMapper;

    @Transactional(rollbackFor = Exception.class)
    public List<StudyRespDto> getStudies() {
        List<Study> studies = studyMapper.getStudies();
        List<StudyRespDto> studyRespDtos = new ArrayList<>();

        for (Study study : studies) {
            StudyRespDto dto = StudyRespDto.builder()
                    .studyId(study.getStudyId())
                    .leaderId(study.getLeaderId())
                    .studyNm(study.getStudyNm())
                    .studyDc(study.getStudyDc())
                    .category(study.getCategory())
                    .mpngSn(study.getMpngSn())
                    .maxMbrNocs(study.getMaxMbrNocs())
                    .studyStatusCode(study.getStudyStatusCode())
                    .build();

            studyRespDtos.add(dto);
        }

        return studyRespDtos;
    }

}
