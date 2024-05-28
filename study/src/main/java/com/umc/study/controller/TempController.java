package com.umc.study.controller;

import com.umc.study.common.dto.SuccessMessage;
import com.umc.study.common.dto.SuccessStatusResponse;
import com.umc.study.service.dto.response.TempResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempController {

  @GetMapping("/test")
  public ResponseEntity<SuccessStatusResponse> testAPI(){

    return ResponseEntity.status(HttpStatus.CREATED)
        .body(SuccessStatusResponse.of(
            SuccessMessage.REVIEW_CREATE_SUCCESS,
            TempResponse.of("This is Test!")));
  }
}