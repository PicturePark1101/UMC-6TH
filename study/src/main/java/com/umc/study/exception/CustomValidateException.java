package com.umc.study.exception;

import com.umc.study.common.dto.ErrorMessage;
import lombok.Getter;

@Getter
public class CustomValidateException extends BusinessException {

  public CustomValidateException(ErrorMessage errorMessage) {
    super(errorMessage);
  }

}
