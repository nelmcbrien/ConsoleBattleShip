/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clanmcbrien;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bnelson
 */
public class Main {
    
    public static void main(String[] args){
        // declares an array of Strings
        String[][] board;
        // initialize an array of Strings as "board"
        board = new String[5][5];
        
       Logic.populateBoard(board);
       String ship = Logic.placeShip();
       Boolean run = true;
       
       while(run){
           int shots = 0;
           /*for(int i = 0; i < 21; i++){
               System.out.println();
           }*/
           Logic.printBoard(board);
           String shotFired = Logic.nextShot();
           if(shotFired.equals(ship)){
               System.out.println("Direct Hit!!!");
               System.out.println("You Win!!!");
               run = false;
           }else{
               System.out.println("Miss...");
               //TODO All this is debuging console output, remove later-BLN
               int x = Character.getNumericValue(shotFired.charAt(0));
               int y = Character.getNumericValue(shotFired.charAt(1));
               System.out.println(x + "" + y + "Integers...");
               board[x][y] = "X ";
               System.out.println(shotFired + " shot value(-1 from input)...");
               System.out.println(ship + " ship location...");
               
                //Increment shots and print
               shots +=  1;
               System.out.println("Shots: " + shots);
           
               //add some space in console
               System.out.println();
               System.out.println();
           }           
           
           
       }
    }
}