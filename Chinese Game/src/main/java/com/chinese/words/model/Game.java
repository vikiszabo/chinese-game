package com.chinese.words.model;

import java.util.List;
import java.util.Random;

public class Game {

    Integer id;

    List<Hanzi> hanzis;

    List<Solution> solutions;

    Random random = new Random();

    List<Hanzi> randomHanzis = random.nextInt();
}
