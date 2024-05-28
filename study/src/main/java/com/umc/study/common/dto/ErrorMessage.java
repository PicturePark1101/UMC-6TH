package com.umc.study.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorMessage {

  MEMBER_NOT_FOUND_BY_ID_EXCEPTION(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 사용자가 존재하지 않습니다."),
  MISSION_NOT_FOUND_BY_ID_EXCEPTION(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 미션이 존재하지 않습니다."),
  RESTAURANT_NOT_FOUND_BY_ID_EXCEPTION(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 식당이 존재하지 않습니다.");
  ;

  private final int status;
  private final String message;
}
