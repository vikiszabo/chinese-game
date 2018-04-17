package com.chinese.words.service;

import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import com.chinese.words.repository.HanziRepository;
import com.chinese.words.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HanziService {

    @Autowired
    HanziRepository hanziRepository;


    @Autowired
    WordRepository wordRepository;

    public HanziService(HanziRepository hanziRepository, WordRepository wordRepository) {
        this.hanziRepository = hanziRepository;
        this.wordRepository = wordRepository;
    }

    public void saveHanzi(String name, String pinyin) {
        Hanzi hanzi = new Hanzi(name, pinyin);
        hanziRepository.save(hanzi);
    }

    public Hanzi findHanziById(Integer id){
        return hanziRepository.getOne(id);
    }
/*
    public List<Hanzi> findHanzisByWord(Word word){
        return hanziRepository.findAllByWord(word);
    }
*/
}
