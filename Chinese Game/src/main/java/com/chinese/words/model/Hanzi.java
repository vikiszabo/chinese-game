package com.chinese.words.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "hanzi")
@JsonIgnoreProperties(value = { "words" })
public class Hanzi {

    @Id
    @GeneratedValue
    @Column(name="hanzi_id")
    private Integer id;

    @Column(unique = true)
    private String name;

    private String pinyin;

    @ManyToMany(mappedBy = "hanzis", fetch = FetchType.EAGER)
    private List<Word> words = new ArrayList<>();

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hanzi hanzi = (Hanzi) o;
        return Objects.equals(name, hanzi.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
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
