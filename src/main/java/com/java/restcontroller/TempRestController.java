package com.java.restcontroller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Validated
@RestController
public class TempRestController {

    @Operation(summary = "Greet the world", description = "Returns a greeting message.")
    @GetMapping("/hello")
    public String sayHello(
            @RequestParam @Valid @ValidName String name,
            @RequestParam @Valid @ValidAge Integer age) {
        return "Hello, " + name + "! You are " + age + " years old.";
    }
}
