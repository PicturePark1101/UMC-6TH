package com.umc.study.service;

import com.umc.study.common.dto.ErrorMessage;
import com.umc.study.domain.Member;
import com.umc.study.domain.MemberMission;
import com.umc.study.domain.Mission;
import com.umc.study.domain.Restaurant;
import com.umc.study.exception.NotFoundException;
import com.umc.study.repository.MemberMissionRepository;
import com.umc.study.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberMissionService {

  private final MemberMissionRepository memberMissionRepository;
  private final MissionRetriever missionRetriever;
  private final MemberRetriever memberRetriever;

  public String createMemberMission(final long memberId, final long restaurantId) {

    Member findMember = memberRetriever.findById(memberId);
    Mission mission = missionRetriever.findById(restaurantId);

    MemberMission newMemberMission = memberMissionRepository.save(MemberMission.create(
        findMember, mission));

    return newMemberMission.getId().toString();
  }

}
