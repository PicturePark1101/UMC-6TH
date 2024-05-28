package com.umc.study.repository;

import com.umc.study.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
