package com.john.controller.rest;

import com.john.model.Test;
import com.john.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private TestService testService;

    /**
     * Handle request to the default page
     */
    @GetMapping("/")
    public List<Test> viewHome() {

        return testService.findAllTests();
    }


}
