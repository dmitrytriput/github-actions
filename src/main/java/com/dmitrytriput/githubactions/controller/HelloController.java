package com.dmitrytriput.githubactions.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/hello2")
    public String getMessage() {
        return "Hello World 2";
    }
}
