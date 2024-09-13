package com.klapertart.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tritronik
 * @since 9/12/2024
 */
@RestController
@CrossOrigin()
public class HelloController {

    @RequestMapping({ "/hello" })
    public String hello() {
        return "Hello World";
    }

}
