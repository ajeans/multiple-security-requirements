package com.quicksign.springdoc.security.multiplesecurityrequirements;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;

@OpenAPIDefinition(
    info =
    @Info(
        title = "Reproducer",
        version = "0.1.0-SNAPSHOT",
        description = "Test multiple security requirements"))
/*
Doesn't work: "components" is empty
@SecuritySchemes({
    @SecurityScheme(name = "basicAuth", type = SecuritySchemeType.HTTP, scheme = "basic"),
    @SecurityScheme(
        name = "bearerToken",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT")
})*/
// Works for one scheme: "components" has 1 "securitySchemes"
@SecurityScheme(
    name = "bearerToken",
    type = SecuritySchemeType.HTTP,
    scheme = "bearer",
    bearerFormat = "JWT")
public class OpenApiConfiguration {
}
