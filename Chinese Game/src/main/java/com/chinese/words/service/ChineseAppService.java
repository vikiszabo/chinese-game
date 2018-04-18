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

    public void saveWord(String chinese, String english) {
        Word word = new Word(chinese, english);
        wordRepository.save(word);
    }

    public List<Hanzi> listAllHanzis() {
        return hanziRepository.findAll();
    }



    public String getHanziById(Integer id){
        return hanziRepository.findOne(id).getName();
    }


    public List<Word> showWordsByCharacterId(Integer id){
        List<Word> words = wordRepository.findAll();
        Hanzi hanzi = hanziRepository.getOne(id);
        for (Word word : words) {

        }

        return new ArrayList<>();
    }

    public int getNumberOfSolutionsByCharacterSet() {
        return 2;
    }

    public void getSolutionsByCharacterSet() {

    }

}
