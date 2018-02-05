package com.cloudbees.test.kubernetes.draft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:cleclerc@cloudbees.com">Cyrille Le Clerc</a>
 */
@RestController
public class HomeController {

    @GetMapping(path = "/")
    @ResponseBody
    public String home() {
        return "My Spring Boot App packaged with Azure Draft";
    }
}
