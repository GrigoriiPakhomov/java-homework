package main.java.hangman;

public class Game {
    int lives = 7;

    public int getLives(){
        return lives;
    }
     public void reduceLives(){
        lives--;
     }
}
