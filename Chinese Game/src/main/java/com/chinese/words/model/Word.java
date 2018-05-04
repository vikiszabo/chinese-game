package com.chinese.words.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties(value = { "hanzis" })
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="word_id")
    private Integer id;

    @Column(name = "chinese_meaning")
    private String chineseMeaning;

    @Column(name = "english_meaning")
    private String englishMeaning;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JoinTable(name = "word_hanzi", joinColumns = {@JoinColumn(name = "word_id", referencedColumnName = "word_id")},
    //inverseJoinColumns = {@JoinColumn(name = "hanzi_id", referencedColumnName = "hanzi_id")})
    private Set<Hanzi> hanzis = new HashSet<>();

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

    public Set<Hanzi> getHanzis() {
        return hanzis;
    }

    public void setHanzis(Set<Hanzi> hanzis) {
        this.hanzis = hanzis;
    }

    public String getEnglishMeaning() {
        return englishMeaning;
    }

    public String getChineseMeaning() {
        return chineseMeaning;
    }

    public void setChineseMeaning(String chineseMeaning) {
        this.chineseMeaning = chineseMeaning;
    }

    public void setEnglishMeaning(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    public void addHanzi(Hanzi hanzi){
        this.hanzis.add(hanzi);
        hanzi.getWords().add(this);
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
}
