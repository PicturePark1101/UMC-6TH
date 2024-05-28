package com.umc.study.repository;

import com.umc.study.domain.Restaurant;
import com.umc.study.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReivewRepository extends JpaRepository<Review, Long> {

}
