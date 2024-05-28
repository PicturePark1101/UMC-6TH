package com.umc.study.service;

import com.umc.study.domain.Member;
import com.umc.study.domain.Restaurant;
import com.umc.study.domain.Review;
import com.umc.study.repository.ReivewRepository;
import com.umc.study.service.dto.request.ReviewCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReviewService {

  private final ReivewRepository reviewRepository;
  private final RestaurantRetriever restaurantRetriever;
  private final MemberRetriever memberRetriever;

  @Transactional
  public String createReview(final long restaurantId, ReviewCreateRequest reviewCreateRequest) {

    Member findMember = memberRetriever.findById(1L);
    Restaurant restaurant = restaurantRetriever.findById(restaurantId);

    Review newReview = reviewRepository.save(Review.create(restaurant, findMember,
        reviewCreateRequest.content(), reviewCreateRequest.rate()
    ));
    return newReview.getId().toString();
  }
}
