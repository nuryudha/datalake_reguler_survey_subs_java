package com.datalake.datalake_reguler_survey_subs_java.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getMethodName() {
        return "Data Lake Reguler Survey Subscriber is Running !";
    }
}
