package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kaushikurl")
public class sampleapi
{
    @GetMapping
    public ResponseEntity<String> get()
    {
        return ResponseEntity.ok("hello my name is kaushik from sample");
    }
}
