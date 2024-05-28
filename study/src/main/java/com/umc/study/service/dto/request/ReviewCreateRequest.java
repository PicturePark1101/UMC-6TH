package com.umc.study.service.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record ReviewCreateRequest(

    @NotEmpty
    String content,

    @NotNull
    double rate
) {

}
