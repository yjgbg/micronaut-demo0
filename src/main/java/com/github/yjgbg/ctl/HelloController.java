package com.github.yjgbg.ctl;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get("hello")
    public String hello() {
        return "hello";
    }
}
