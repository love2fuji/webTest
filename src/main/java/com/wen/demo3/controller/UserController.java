package com.wen.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author edgar
 * @version v1.0
 * @description: TODO
 * @date 2023/6/23 19:09
 */

@RestController
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "test 哈哈";
    }

}
