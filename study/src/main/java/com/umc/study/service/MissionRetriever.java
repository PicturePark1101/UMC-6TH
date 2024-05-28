package com.umc.study.service;

import com.umc.study.common.dto.ErrorMessage;
import com.umc.study.domain.Member;
import com.umc.study.domain.Mission;
import com.umc.study.exception.NotFoundException;
import com.umc.study.repository.MemberRepository;
import com.umc.study.repository.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MissionRetriever {

  private MissionRepository missionRepository;

  public Mission findById(final long id) {
    return missionRepository.findById(id).orElseThrow(
        () -> new NotFoundException(ErrorMessage.MISSION_NOT_FOUND_BY_ID_EXCEPTION));
  }
}
