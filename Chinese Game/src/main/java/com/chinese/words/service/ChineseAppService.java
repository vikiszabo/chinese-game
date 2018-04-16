package com.chinese.words.service;

import com.chinese.words.model.Hanzi;
import com.chinese.words.repository.HanziRepository;
import com.chinese.words.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChineseAppService {

    @Autowired
    private HanziRepository hanziRepository;

    @Autowired
    private WordRepository wordRepository;

    public ChineseAppService(HanziRepository hanziRepository, WordRepository wordRepository) {
        this.hanziRepository = hanziRepository;
        this.wordRepository = wordRepository;
    }

    public void saveHanzi(String name, String pinyin){
        Hanzi hanzi = new Hanzi(name, pinyin);
        hanziRepository.save(hanzi);
    }



}
