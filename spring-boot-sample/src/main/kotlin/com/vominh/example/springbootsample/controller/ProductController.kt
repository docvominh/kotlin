package com.vominh.example.springbootsample.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController {
    @GetMapping("/")
    fun all(): ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.OK).body("Hello")
    }
}