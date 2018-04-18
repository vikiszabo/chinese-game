package com.chinese.words.repository;

import com.chinese.words.ChineseApp;
import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { ChineseApp.class })
public class WordRepositoryTest {

    @Autowired
    WordRepository wordRepository;

    @Autowired
    HanziRepository hanziRepository;

    @Test
    public void testFindAllByOneHanzi() {
        Hanzi hanzi = hanziRepository.findOne(1);
        List<Word> words = wordRepository.findAllByHanzisIn(Arrays.asList(hanzi));
        assertEquals(1, words.size());
        assertEquals("hi", words.get(0).getEnglishMeaning());
    }

    @Test
    public void testFindAllByMultipleHanzi() {
        Hanzi hanzi = hanziRepository.findOne(1);
        Hanzi hanzi2 = hanziRepository.findOne(97);
        List<Word> words = wordRepository.findAllByHanzisIn(Arrays.asList(hanzi,hanzi2));
        assertEquals(2, words.size());
        assertEquals("hi", words.get(0).getEnglishMeaning());
        assertEquals("friend", words.get(1).getEnglishMeaning());
    }

    @Test
    public void testCountAllByHanzis() {
        Hanzi hanzi = hanziRepository.findOne(1);
        Hanzi hanzi2 = hanziRepository.findOne(97);
        int count = wordRepository.countAllByHanzisIn(Arrays.asList(hanzi,hanzi2));
        assertEquals(2, count);
    }
}