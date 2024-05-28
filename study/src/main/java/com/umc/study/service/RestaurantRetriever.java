package com.umc.study.service;

import com.umc.study.common.dto.ErrorMessage;
import com.umc.study.domain.Restaurant;
import com.umc.study.exception.NotFoundException;
import com.umc.study.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RestaurantRetriever {

  private RestaurantRepository restaurantRepository;

  public Restaurant findById(final long id) {
    return restaurantRepository.findById(id).orElseThrow(
        () -> new NotFoundException(ErrorMessage.RESTAURANT_NOT_FOUND_BY_ID_EXCEPTION));
  }
}
