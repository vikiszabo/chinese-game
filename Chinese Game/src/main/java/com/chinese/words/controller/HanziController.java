package com.chinese.words.controller;


import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HanziController {

    @Autowired
    Hanzi hanzi;

    @Autowired
    Word word;




}
