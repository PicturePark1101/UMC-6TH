package com.umc.study.controller;

import com.umc.study.common.dto.SuccessMessage;
import com.umc.study.common.dto.SuccessStatusResponse;
import com.umc.study.service.ReviewService;
import com.umc.study.service.dto.request.ReviewCreateRequest;
import com.umc.study.service.dto.response.TempResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

  private final ReviewService reviewService;

  @PostMapping("/{restaurantId}")
  public ResponseEntity<SuccessStatusResponse> postReview(
      @PathVariable(name = "restaurantId") long restaurantId,
      @RequestBody ReviewCreateRequest reviewCreateRequest
  ){

    return ResponseEntity.status(HttpStatus.CREATED)
        .header("Location", reviewService.createReview(restaurantId, reviewCreateRequest))
        .body(SuccessStatusResponse.of(
            SuccessMessage.REVIEW_CREATE_SUCCESS));
  }
}
