package com.umc.study.service.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record MissionCreateRequest(
    @NotEmpty
    String description,
    @NotNull
    int point
) {

}
