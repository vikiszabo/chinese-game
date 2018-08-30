package com.chinese.words.repository;

import com.chinese.words.model.Hanzi;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HanziRepository extends JpaRepository<Hanzi, Integer> {


//    List<Hanzi> findAllByWord(Word word);

    Hanzi findByName(String name);
}
