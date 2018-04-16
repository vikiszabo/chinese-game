package com.chinese.words.controller;


import com.chinese.words.service.ChineseAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class HanziController {

    @Autowired
    private ChineseAppService chineseAppService;

    @RequestMapping
    @ResponseBody
    String hello() {
        return "Hello World! Spring boot is so simple.";
    }



}
