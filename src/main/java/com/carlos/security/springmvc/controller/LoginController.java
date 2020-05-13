package com.carlos.security.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carlos
 * @version 1.0.0
 * @date 2020/5/13 20:11
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login-success", produces = {"text/plain;charset=UTF-8"})
    public String loginSuccess() {
        return "登录成功";
    }

    @RequestMapping(value = "/r/r1", produces = {"text/plain;charset=UTF-8"})
    public String r1() {
        return "访问资源 1";
    }

    @RequestMapping(value = "/r/r2", produces = {"text/plain;charset=UTF-8"})
    public String r2() {
        return "访问资源 2";
    }


}
