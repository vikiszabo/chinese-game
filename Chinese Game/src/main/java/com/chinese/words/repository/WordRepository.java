package com.chinese.words.repository;

import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<Word, Integer>{

    List<Word> findAllByHanzisIn(List<Hanzi> hanzis);

    int countAllByHanzisIn(List<Hanzi> hanzis);
}
