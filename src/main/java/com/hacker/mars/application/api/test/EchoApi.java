package com.hacker.mars.application.api.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author: 韩福贵
 * @date: 2023-10-14
 */
@RestController
@RequestMapping("/echo")
public class EchoApi {

    @GetMapping("/echo")
    public String echo() {
        return "echo";
    }

}
