package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@RestController
public class TestAPI {

    @NonNull
    @GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin
    public String test() {
        return "Hello World";
    }
}
