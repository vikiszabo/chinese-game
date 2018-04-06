package com.chinese.words.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "word")
public class Word {
    
    Integer id;

    @Column(name = "chinese_meaning")
    String chineseMeaning;

    @Column(name = "english_meaning")
    String englishMeaning;


    List<Hanzi> hanzis;


    public Word(String chineseMeaning, String englishMeaning, List<Hanzi> hanzis) {
        this.chineseMeaning = chineseMeaning;
        this.englishMeaning = englishMeaning;
        this.hanzis = hanzis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Hanzi> getCharacters() {
        return hanzis;
    }

    public void setCharacters(List<Hanzi> hanzis) {
        this.hanzis = hanzis;
    }
}
