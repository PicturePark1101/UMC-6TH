package com.umc.study.controller;

import com.umc.study.common.dto.SuccessMessage;
import com.umc.study.common.dto.SuccessStatusResponse;
import com.umc.study.service.MemberMissionService;
import com.umc.study.service.MissionService;
import com.umc.study.service.dto.request.MissionCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/missions/challenge")
@RequiredArgsConstructor
public class MemberMissionController {

  private final MemberMissionService memberMissionService;

  @PostMapping("/{memberId}/{restaurantId}")
  public ResponseEntity<SuccessStatusResponse> postReview(
      @PathVariable(name = "memberId") long memberId,
      @PathVariable(name = "missionId") long missionId
  ){

    return ResponseEntity.status(HttpStatus.CREATED)
        .header("Location", memberMissionService.createMemberMission(memberId, missionId))
        .body(SuccessStatusResponse.of(
            SuccessMessage.MEMBER_MISSION_CREATE_SUCCESS));
  }
}
