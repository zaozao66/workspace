package com.zao.workspace.controller;

import com.zao.workspace.dao.TMUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @Autowired
    private TMUserMapper tmUserMapper;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "hello world";
    }

    @GetMapping("/test")
    public String test() {
        return tmUserMapper.selectByPrimaryKey(1L).toString();
    }
}
