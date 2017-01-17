/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obl_opgave2;

/**
 *
 * @author Nao
 */
public class Game {

    private Player player;
    private int playerScore;
    private Player house;
    private int houseScore;

    public int playGame1() {

        System.out.println("10 dices are thrown for you ");
        Die die = new Die(6);
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        Die die3 = new Die(6);
        Die die4 = new Die(6);
        Die die5 = new Die(6);
        Die die6 = new Die(6);
        Die die7 = new Die(6);
        Die die8 = new Die(6);
        Die die9 = new Die(6);

        int kast = die.throwDie();
        int kast1 = die1.throwDie();
        int kast2 = die2.throwDie();
        int kast3 = die3.throwDie();
        int kast4 = die4.throwDie();
        int kast5 = die5.throwDie();
        int kast6 = die6.throwDie();
        int kast7 = die7.throwDie();
        int kast8 = die8.throwDie();
        int kast9 = die9.throwDie();

        playerScore = kast + kast1 + kast2 + kast3 + kast4 + kast5 + kast6 + kast7 + kast8 + kast9;

        System.out.println("Your score :" + playerScore);

        System.out.println("10 dices are thrown for the house");

        Die die10 = new Die(6);
        Die die11 = new Die(6);
        Die die12 = new Die(6);
        Die die13 = new Die(6);
        Die die14 = new Die(6);
        Die die15 = new Die(6);
        Die die16 = new Die(6);
        Die die17 = new Die(6);
        Die die18 = new Die(6);
        Die die19 = new Die(6);

        int kast10 = die10.throwDie();
        int kast11 = die11.throwDie();
        int kast12 = die12.throwDie();
        int kast13 = die13.throwDie();
        int kast14 = die14.throwDie();
        int kast15 = die15.throwDie();
        int kast16 = die16.throwDie();
        int kast17 = die17.throwDie();
        int kast18 = die18.throwDie();
        int kast19 = die19.throwDie();

        houseScore = kast10 + kast11 + kast12 + kast13 + kast14 + kast15 + kast16 + kast17 + kast18 + kast19;

        System.out.println("House's score :" + houseScore);

        System.out.println("The result is -");

        if (playerScore <= houseScore) {
            System.out.println("The House wins!! ");
        } else {
            System.out.println("The Player Wins!!");
        }
        System.out.println("\n");
        return 0;
    }

    public int playGame2() {
        System.out.println("10 dices are thrown for you ");
        Die die = new Die(12);
        Die die1 = new Die(12);
        Die die2 = new Die(12);
        Die die3 = new Die(12);
        Die die4 = new Die(12);
        Die die5 = new Die(24);
        Die die6 = new Die(24);
        Die die7 = new Die(24);
        Die die8 = new Die(24);
        Die die9 = new Die(24);

        int kast = die.throwDie();
        int kast1 = die1.throwDie();
        int kast2 = die2.throwDie();
        int kast3 = die3.throwDie();
        int kast4 = die4.throwDie();
        int kast5 = die5.throwDie();
        int kast6 = die6.throwDie();
        int kast7 = die7.throwDie();
        int kast8 = die8.throwDie();
        int kast9 = die9.throwDie();

        playerScore = kast + kast1 + kast2 + kast3 + kast4 + kast5 + kast6 + kast7 + kast8 + kast9;

        System.out.println("10 dices are thrown for the house ");
        Die die10 = new Die(12);
        Die die11 = new Die(12);
        Die die12 = new Die(12);
        Die die13 = new Die(12);
        Die die14 = new Die(12);
        Die die15 = new Die(24);
        Die die16 = new Die(24);
        Die die17 = new Die(24);
        Die die18 = new Die(24);
        Die die19 = new Die(24);

        int kast10 = die10.throwDie();
        int kast11 = die11.throwDie();
        int kast12 = die12.throwDie();
        int kast13 = die13.throwDie();
        int kast14 = die14.throwDie();
        int kast15 = die15.throwDie();
        int kast16 = die16.throwDie();
        int kast17 = die17.throwDie();
        int kast18 = die18.throwDie();
        int kast19 = die19.throwDie();

        houseScore = kast10 + kast11 + kast12 + kast13 + kast14 + kast15 + kast16 + kast17 + kast18 + kast19;

        if (playerScore % 2 == 0) {
            playerScore = playerScore * 2;

        }
        System.out.println("Players score :" + playerScore);
        if (houseScore % 2 == 0) {
            houseScore = houseScore * 2;

        }
        System.out.println("House score :" + houseScore);
        if (playerScore <= houseScore) {
            System.out.println("The result is -");
            System.out.println("The House wins!! ");
        } else {
            System.out.println("The Player Wins!!");
        }
        System.out.println("\n");
        return 0;

    }

    public int playGame3() {
        Die die = new Die(6);
        int kast = die.throwDie();
        if (kast < 4) {
            Die die1 = new Die(12);
            int kast1 = die1.throwDie();
            playerScore = kast1 + kast;
        } else {
            Die die2 = new Die(10);
            int kast2 = die2.throwDie();
            playerScore = kast2 + kast;
        }
        System.out.println("Players score :" + playerScore);

        Die die3 = new Die(6);
        int kast3 = die3.throwDie();
        if (kast < 4) {
            Die die4 = new Die(12);
            int kast4 = die3.throwDie();
            houseScore = kast4 + kast3;
        } else {
            Die die5 = new Die(10);
            int kast5 = die5.throwDie();
            houseScore = kast5 + kast3;
        }
        System.out.println("House score :" + houseScore);
        System.out.println("The result is - ");

        if (playerScore >= houseScore) {
            System.out.println("The House wins!! ");
        } else {
            System.out.println("The Player Wins!!");
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", playerScore=" + playerScore + ", house=" + house + ", houseScore=" + houseScore + '}';
    }

}
