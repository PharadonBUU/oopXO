/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author pondz
 */
public class Game {

    private Player player1, player2;
    private Table table;

    public Game() {
        player1 = new Player('X');
        player2 = new Player('O');
    }

    public void play() {
        boolean isFinish = false;
        while (!isFinish) {
            printWelcome();
            printTable();
            printTurn();
            inputPosition();
            if(table.checkWin()){
                isFinish = true;
            }
            if(table.checkDraw()){
                isFinish= true;
            }
        }

    }

    private void printWelcome() {
            System.out.println("Welcome to XO Game");
        }

    private void printTable() {
        char[] ListXO = table.getTable();
        System.out.println(ListXO[0] + " " + ListXO[1] + " " + ListXO[2]);
        System.out.println(ListXO[3] + " " + ListXO[4] + " " + ListXO[5]);
        System.out.println(ListXO[6] + " " + ListXO[7] + " " + ListXO[8]);
        System.out.println("");    }

    private void printTurn() {
            System.out.println(table.getCurrentPlayer().getSymbol()+" Turn");
    }

    private void inputPosition() {
       Scanner sc = new Scanner(System.in);
       int position = sc.nextInt();
       table.setPosition(position);
    }

}
