package model;

import java.util.Random;

/**
 * Hills is the class that run the Game or mines Coal.
 *  
 * Constructors: Hills()
 * 
 * Methods: excavate, mineCoal, hunt, replenishGame
 * 
 * @author Marios
 *
 */
class Hills {
    private static Random rand = new Random();

    private Game[] game;
    private int numGame;

    private int[][] goldLocation = new int[25][25];
    private int[][] coalLocation = new int[15][15];

    public Hills() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                goldLocation[i][j] = rand.nextInt(300);
                j += rand.nextInt(4);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                coalLocation[i][j] = rand.nextInt(10) + 1;
            }
        }
        game = new Game[10];
        numGame = 0;
        replenishGame();
    }

    /**
     * @return goldLocation[i][j];
     */
    public int excavate() {
        int i = rand.nextInt(25);
        int j = rand.nextInt(25);

        return goldLocation[i][j];
    }

    /**
     * @return coalLocation[i][j];
     */
    public int mineCoal() {
        int i = rand.nextInt(15);
        int j = rand.nextInt(15);

        return coalLocation[i][j];
    }

    /**
     * @return hunted;
     */
    public Game hunt() {
        Game hunted;
        if (numGame > 0) {
            hunted = game[--numGame];
        } else {
            hunted = null;
        }
        return hunted;
    }

    /**
     * @return boolean;
     */
    public boolean replenishGame() {
        if (numGame == 0) {
            for (int i = 0; i < game.length; i++) {
                game[i] = new Game(rand.nextInt(20));
            }
            numGame = game.length;
            return true;
        }
        return false;
    }
}
