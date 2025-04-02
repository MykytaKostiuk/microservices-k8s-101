package com.ms.intro.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/health")
@AllArgsConstructor
public class HealthController {

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public String health() {
        return "Hello from the resources";
    }

}
