package com.studit.domain.study.mapper;

import com.studit.domain.study.dto.study.CategoryRespDto;
import com.studit.domain.study.dto.study.RegionRespDto;
import com.studit.domain.study.dto.study.StudyListReqDto;
import com.studit.domain.study.dto.study.StudyListRespDto;
import com.studit.domain.study.entity.Study;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyListMapper {

    /**
     * 스터디 목록 전체 조회
     * (study 테이블 활용)
     */
    List<Study> getStudyList();

    /**
     * 스터디 목록 검색
     * (study 테이블 활용)
     */
    List<StudyListRespDto> searchStudyList(StudyListReqDto studyListReqDto);

    /**
     * 지역 목록 조회
     * (region 테이블 활용)
     */
    List<RegionRespDto> getRegionList();

    /**
     * 카테고리 목록 조회
     * (category 테이블 활용)
     */
    List<CategoryRespDto> getCategoryList();

}
