package com.chinese.words.service;

import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import com.chinese.words.repository.HanziRepository;
import com.chinese.words.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WordService {

    @Autowired
    HanziRepository hanziRepository;


    @Autowired
    WordRepository wordRepository;


    public WordService(HanziRepository hanziRepository, WordRepository wordRepository) {
        this.hanziRepository = hanziRepository;
        this.wordRepository = wordRepository;
    }

    public void saveWord(String chinese, String english) {
        Word word = new Word(chinese, english);
        wordRepository.save(word);
    }
/*
    public List<Word> findAllByHanzi(Hanzi hanzi){
        return wordRepository.findAllByHanzi(hanzi);
    }
*/
}
