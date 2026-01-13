package com.studit.domain.study.repository;

import com.studit.domain.study.entity.Study;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyMapper {

    List<Study> getStudies();

}
