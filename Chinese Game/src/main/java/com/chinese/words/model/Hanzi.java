package com.chinese.words.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "character")
public class Hanzi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String pinyin;

    List<Word> words;


    public Hanzi(String name, String pinyin, List<Word> words) {
        this.id = id;
        this.name = name;
        this.pinyin = pinyin;
        this.words = words;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
