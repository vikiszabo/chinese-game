package com.chinese.words.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hanzi")
public class Hanzi {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String pinyin;

    @ManyToMany(mappedBy = "hanzis")
    List<Word> words;

    public Hanzi(){};

    public Hanzi(String name, String pinyin) {
        this.name = name;
        this.pinyin = pinyin;
    }


    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public Integer getId() {
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

    @Override
    public String toString() {
        return "Hanzi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", words=" + words +
                '}';
    }
}
