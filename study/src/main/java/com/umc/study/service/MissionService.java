package com.umc.study.service;

import com.umc.study.domain.Mission;
import com.umc.study.domain.Restaurant;
import com.umc.study.repository.MissionRepository;
import com.umc.study.service.dto.request.MissionCreateRequest;
import com.umc.study.service.dto.request.ReviewCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MissionService {

  private final MissionRepository missionRepository;
  private final RestaurantRetriever restaurantRetriever;


  @Transactional
  public String createMission(final long restaurantId, MissionCreateRequest missionCreateRequest) {

    Restaurant restaurant = restaurantRetriever.findById(restaurantId);

    Mission newMission = missionRepository.save(Mission.create(
        restaurant, missionCreateRequest.description(), missionCreateRequest.point()
    ));
    return newMission.getId().toString();
  }
}
