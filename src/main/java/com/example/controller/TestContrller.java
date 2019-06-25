package com.example.controller;

import com.example.common.enums.ResultEnum;
import com.example.common.response.Result;
import com.example.exception.DemoException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestContrller {
    @GetMapping("/testError")
    public Result testError() throws DemoException {
        throw new DemoException(ResultEnum.ERROR);
    }
}
