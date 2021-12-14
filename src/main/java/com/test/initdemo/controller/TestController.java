package com.test.initdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libo.a
 * @date 2021/12/14 3:50 PM
 */
@Slf4j
@RestController
public class TestController {

    /**
     * 得到信息
     *
     * @return {@link String}
     */
    @GetMapping("/test")
    public String getInfo(String a) {
        log.info("input {}", a);
        return "hello world";
    }
}
