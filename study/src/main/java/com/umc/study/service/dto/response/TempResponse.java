package com.umc.study.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public record TempResponse(
    String testString
) {

  public static TempResponse of(String testString){
      return new TempResponse(testString);
  }
}
