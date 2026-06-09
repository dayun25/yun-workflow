package com.dayun.yunworkflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 多一个@ResponseBody，让Knife可以扫描到
@RequestMapping("/health")
public class HealthController {
    @GetMapping("/")
    public String health() {
        return "ok";
    }
}
