package com.umc.study.exception;

import com.umc.study.common.dto.ErrorMessage;
import lombok.Getter;

@Getter
public class NotFoundException extends BusinessException {

  public NotFoundException(ErrorMessage errorMessage) {
    super(errorMessage);
  }

}
