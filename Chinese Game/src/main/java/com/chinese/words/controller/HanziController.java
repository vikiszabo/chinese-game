package com.chinese.words.controller;


import com.chinese.words.model.Word;
import com.chinese.words.service.ChineseAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@Controller
public class HanziController {

    @Autowired
    private ChineseAppService chineseAppService;

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("hanzis", chineseAppService.listAllHanzis());
        model.addAttribute("chinese_char", chineseAppService.getHanziById(1));
        return "welcome";
    }

    @RequestMapping("/wordsByHanziId/{id}")
    @ResponseBody
    public List<Word> welcome(Model model, @PathVariable Integer id) {
        List<Word> words = chineseAppService.showWordsByCharacterId(id);
        return words;
    }




}
