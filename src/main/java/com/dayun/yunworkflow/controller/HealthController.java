package com.dayun.yunworkflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dqy
 * @version 1.0
 * @date 2026/6/9 16:46
 */
@RestController // 多一个@ResponseBody，让Knife可以扫描到
@RequestMapping("/health")
public class HealthController {
    @GetMapping("/")
    public String health() {
        return "ok";
    }
}
