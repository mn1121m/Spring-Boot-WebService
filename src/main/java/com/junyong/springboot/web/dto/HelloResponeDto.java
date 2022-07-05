package com.junyong.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 1
@RequiredArgsConstructor // 2

public class HelloResponeDto {

    private final String name;
    private final int amount;
}
