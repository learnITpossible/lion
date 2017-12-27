package com.domain.lion.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.domain.lion.controller
 * @author Mark Li
 * @version 1.0.0
 * @since 2017/12/27
 */
@RestController
@RefreshScope
public class DefaultController {

    @Value("${hello}")
    String hello;

    @RequestMapping("/hello")
    public String hello() {
        return hello;
    }
}
