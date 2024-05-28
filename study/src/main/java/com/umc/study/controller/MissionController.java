package com.umc.study.controller;

import com.umc.study.common.dto.SuccessMessage;
import com.umc.study.common.dto.SuccessStatusResponse;
import com.umc.study.service.MissionService;
import com.umc.study.service.dto.request.MissionCreateRequest;
import com.umc.study.service.dto.request.ReviewCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/missions")
@RequiredArgsConstructor
public class MissionController {

  private final MissionService missionService;

  @PostMapping("/{restaurantId}")
  public ResponseEntity<SuccessStatusResponse> postReview(
      @PathVariable(name = "restaurantId") long restaurantId,
      @RequestBody MissionCreateRequest missionCreateRequest
  ){

    return ResponseEntity.status(HttpStatus.CREATED)
        .header("Location", missionService.createMission(restaurantId, missionCreateRequest))
        .body(SuccessStatusResponse.of(
            SuccessMessage.MISSION_CREATE_SUCCESS));
  }
}
