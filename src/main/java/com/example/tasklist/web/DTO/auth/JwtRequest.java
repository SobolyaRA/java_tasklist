package com.example.tasklist.web.DTO.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Schema(description = "Request for login")
public class JwtRequest {
    @Schema(
            description = "email",
            example = "johndoe1@mail.com"
    )
    @NotNull(
            message = "Username must be not null."
    )
    private String username;

    @Schema(
            description = "password",
            example = "12345"
    )
    @NotNull(
            message = "Password must be not null."
    )
    private String password;

}


