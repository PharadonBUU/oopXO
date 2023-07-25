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

    private char[] table  = {'1','2','3','4','5','6','7','8','9' };
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
        if (table[position - 1]=='X'||table[position - 1]=='O') {
            return false;
        } else {
            table[position - 1] = currentPlayer.getSymbol();
            return true;
        }

    }
}
