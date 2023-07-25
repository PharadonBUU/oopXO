/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author pondz
 */
public class Table {

    private char[] table = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private Player player1, player2, currentPlayer;

    public Table(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;

    }

    public char[] getTable() {
        return table;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean setPosition(int position) {
        if (table[position - 1] == 'X' || table[position - 1] == 'O') {
            return false;
        } else {
            table[position - 1] = currentPlayer.getSymbol();
            return true;
        }

    }

    public boolean checkWin() {
        return false;
    }

    private boolean checkRow1() {
        if (table[0] == currentPlayer.getSymbol() && table[1] == currentPlayer.getSymbol() && table[2] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean checkRow2() {
        if (table[3] == currentPlayer.getSymbol() && table[4] == currentPlayer.getSymbol() && table[5] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean checkRow3() {
        if (table[6] == currentPlayer.getSymbol() && table[7] == currentPlayer.getSymbol() && table[8] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean checkCol1() {
        if (table[0] == currentPlayer.getSymbol() && table[3] == currentPlayer.getSymbol() && table[6] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean checkCol2() {
        if (table[1] == currentPlayer.getSymbol() && table[4] == currentPlayer.getSymbol() && table[7] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean checkCol3() {
        if (table[2] == currentPlayer.getSymbol() && table[5] == currentPlayer.getSymbol() && table[8] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean checkDiagonalLeft() {
        if (table[0] == currentPlayer.getSymbol() && table[4] == currentPlayer.getSymbol() && table[8] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean checkDiagonalRight() {
        if (table[2] == currentPlayer.getSymbol() && table[4] == currentPlayer.getSymbol() && table[6] == currentPlayer.getSymbol()) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
