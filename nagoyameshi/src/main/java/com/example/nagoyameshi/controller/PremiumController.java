package com.example.nagoyameshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/premium")
public class PremiumController {

    @GetMapping("/register")
    public String showPremiumRegisterPage() {
        return "premium/register"; // ← HTMLのパス
    }
}
