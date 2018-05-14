package com.chinese.words.controller;


import com.chinese.words.model.Word;
import com.chinese.words.service.ChineseAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class HanziController {

    @Autowired
    private ChineseAppService chineseAppService;

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("hanzis", chineseAppService.listAllHanzis());
      //  model.addAttribute("chinese_char", chineseAppService.getHanziById(hanzi.getId()));
        return "hanzireference";
    }

    @RequestMapping("/wordsByHanziId/{id}")
    @ResponseBody
    public List<Word> welcome(Model model, @PathVariable Integer id) {
        List<Word> words = chineseAppService.showWordsByCharacterId(id);
        return words;
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "/sign-up";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/howtoplay")
    public String howToPlay() {
        return "/howtoplay";
    }

    @GetMapping("hanzireference")
    public String hanziReference(Model model) {
        model.addAttribute("hanzis", chineseAppService.listAllHanzis());
        return "/hanzireference";
    }


}
