package com.zigzag.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserLoginDto {
    private String email;
    private String name;
    private String picture;
}
