package com.example.jenkinshw2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ContentController {
    private static final String CONTENT = "Hello CI/CD !!!";
    private static final String MODIFIED = "Content changed !!!";
    @GetMapping("/")
    public String getContent() {
        return MODIFIED;
    }
}

