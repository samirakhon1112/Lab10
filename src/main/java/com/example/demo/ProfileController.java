package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Value("${app.name}")
    private String appName;

    @GetMapping("/appName")
    public String getAppName() {
        return appName;
    }
}

@Autowired
private AppConfig appConfig;

@GetMapping("/config")
public String getConfig() {
    return "Title: " + appConfig.getTitle() + ", Version: " + appConfig.getVersion();
}
