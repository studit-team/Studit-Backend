package com.studit.domain.study.controller;

import com.studit.domain.study.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudyController {

    @Autowired
    public StudyService studyService;

    @GetMapping("/studies.do")
    public ResponseEntity<?> getStudies() {

        return ResponseEntity.ok(studyService.getStudies());
    }
}
