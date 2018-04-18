package com.chinese.words.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Word {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "chinese_meaning")
    String chineseMeaning;

    @Column(name = "english_meaning")
    String englishMeaning;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Hanzi> hanzis;

    public Word() {
    }

    public Word(String chineseMeaning, String englishMeaning) {
        this.chineseMeaning = chineseMeaning;
        this.englishMeaning = englishMeaning;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Hanzi> getHanzis() {
        return hanzis;
    }

    public void setHanzis(List<Hanzi> hanzis) {
        this.hanzis = hanzis;
    }


    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", chineseMeaning='" + chineseMeaning + '\'' +
                ", englishMeaning='" + englishMeaning + '\'' +
                ", hanzis=" + hanzis +
                '}';
    }

    public String getEnglishMeaning() {
        return englishMeaning;
    }
}
