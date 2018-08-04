package me.jimmyhuang.joker;

import java.util.Random;

public class Joker {
    public String tellJoke() {
        String[] jokes = new String[]{
                "This is a funny joke...",
                "Joke number 2",
                "just laugh..."};
        Random rand = new Random();
        return jokes[rand.nextInt(jokes.length)];
    }
}
