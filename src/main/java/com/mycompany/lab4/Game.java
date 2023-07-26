/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;
import java.util.Scanner;

public class Game {

    private Player player1, player2;
    private Table table;

    public Game() {
        player1 = new Player('X');
        player2 = new Player('O');
        table = new Table(player1, player2); // Initialize the table here
    }

    public void play() {
        boolean isFinish = false;
        printWelcome();
        while (!isFinish) {
            printTable();
            printTurn();
            inputPosition();
            if (table.checkWin()) {
                printTable();
                printWinner();
                isFinish = true;
            } else if (table.checkDraw()) {
                printTable();
                printDraw();
                isFinish = true;
            }
            table.switchPlayer();
        }
        askForNewGame(); // Ask if players want to continue playing
        System.out.println("End");
    }

    private void printWelcome() {
        System.out.println("Welcome to XO Game");
    }

    private void printTable() {
        char[] ListXO = table.getTable();
        System.out.println(ListXO[0] + " " + ListXO[1] + " " + ListXO[2]);
        System.out.println(ListXO[3] + " " + ListXO[4] + " " + ListXO[5]);
        System.out.println(ListXO[6] + " " + ListXO[7] + " " + ListXO[8]);
        System.out.println("");
    }

    private void printTurn() {
        System.out.println(table.getCurrentPlayer().getSymbol() + " Turn");
    }

    private void inputPosition() {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        table.setPosition(position);
    }

    private void printWinner() {
        System.out.println(table.getCurrentPlayer().getSymbol() + " Win");
    }

    private void printDraw() {
        System.out.println("Draw");
    }

    private void askForNewGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play again? (yes/no)");
        String response = sc.next().toLowerCase();
        if (response.equals("yes")) {
            table.clearTable(); // Clear the table for a new game
            play(); // Start a new game
        }
    }
}
