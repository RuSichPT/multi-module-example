package com.example.application.controller;

import com.example.library.service.EvenOddService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EvenOddController {
    private final EvenOddService evenOddService;

    @GetMapping("/validate/{number}")
    public String isEvenOrOdd(@PathVariable Integer number) {
        return evenOddService.isEvenOrOdd(number);
    }
}
