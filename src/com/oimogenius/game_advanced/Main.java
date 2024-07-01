package com.oimogenius.game_advanced;

public class Main {
    public static void main(String[] args) {
        boolean isPlaying = true;
        while (isPlaying) {
            GuessGame game = new GuessGame();
            isPlaying = game.play();
        }
    }
}
