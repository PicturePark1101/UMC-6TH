package com.umc.study.exception;


import com.umc.study.common.dto.ErrorMessage;

public class UnauthorizedException extends BusinessException {
  public UnauthorizedException(ErrorMessage errorMessage) {
    super(errorMessage);
  }
}
