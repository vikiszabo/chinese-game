package com.chinese.words.service;

import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import com.chinese.words.repository.HanziRepository;
import com.chinese.words.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WordService {

    @Autowired
    HanziRepository hanziRepository;


    @Autowired
    WordRepository wordRepository;


    public WordService(HanziRepository hanziRepository, WordRepository wordRepository) {
        this.hanziRepository = hanziRepository;
        this.wordRepository = wordRepository;
    }

    public void saveWord(String chinese, String english, List<Hanzi> hanzis) {
        Word word = new Word(chinese, english, hanzis);
    }
    
    public List<Word> findAllByHanzi(Hanzi hanzi){
        return wordRepository.findAllByHanzi(hanzi);
    }

}
