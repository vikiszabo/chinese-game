package com.chinese.words.repository;

import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HanziRepository extends JpaRepository<Hanzi, Integer> {


//    List<Hanzi> findAllByWord(Word word);


}
