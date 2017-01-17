/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obl_opgave2;

import java.util.Scanner;

/**
 *
 * @author Nao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        int choice = 0;

        System.out.println("Enter your name: ");
        System.out.println("Welcome " + scan.nextLine());
        System.out.println("Choose a game :)");

        while (!done) {
            System.out.println("1: Game 1 ");
            System.out.println("2: Game 2 ");
            System.out.println("3: Game 3 ");
            System.out.println("4: Quit");

            try {
                String input = scan.nextLine();
                choice = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("invalid input, please try again");
                continue;
            }

            switch (choice) {
                case 1:
                    Game game1 = new Game();
                    game1.playGame1();

                    break;

                case 2:
                    Game game2 = new Game();
                    game2.playGame2();

                    break;

                case 3:
                    Game game3 = new Game();
                    game3.playGame3();

                    break;

                case 4:
                    done = true;
                    break;

                default:
                    System.out.println("No games here, try again ;)");
                    break;
            }

        }
    }
}
