/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clanmcbrien;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bnelson
 */
public class Logic {
    //static int shots = 0;
    
    /**
     * 
     * @param board 
     * Populates the board with all O's(letter) at the start of the game.
     */
    public static void populateBoard(String [][] board){
        for(int i=0; i < 5; i++){
            for (int j=0; j < 5; j++){
                board[j][i] = "O ";
            }
        }
    }    
    
    /**
     * 
     * @param board
     * Prints the current board to the console.
     */
    public static void printBoard(String[][] board){
        for(int i=0; i < board.length; i++){
            for (int j=0; j < 5; j++){
                System.out.print(board[j][i]);
                
            }
            System.out.println();
        }
    }
    
    /**
     * Stores the ship coordinates so it does not show on board.
     * @return 
     */
    public static String placeShip(){
        Random ranNum = new Random();
        String xCoordinate = Integer.toString(ranNum.nextInt(4));
        String yCoordinate = Integer.toString(ranNum.nextInt(4));
    
        return xCoordinate+yCoordinate;
    }
    
    public static String nextShot(){
    Scanner inText = new Scanner(System.in);
           System.out.println("Enter the X coordinate for your next shot(1-5): ");
                     String x = inText.nextLine();
                     int ix = Integer.valueOf(x)-1;
                     x = String.valueOf(ix);
           System.out.println("Enter the Y coordinate for your next shot(1-5): ");
                     String y = inText.nextLine();
                     int iy = Integer.valueOf(y)-1;
                     y = String.valueOf(iy);
        return x+y;
    }
    
    /**
     *  Displays the "miss" message and increments the number of shots.
     * @param shots
     * @return 
     */
    public static int shotMissed(int shots){
        System.out.println("Miss...");
        shots += 1;                     
        //Increment shots and print
        System.out.println("Shots: " + shots);
           
        //add some space in console
        System.out.println();
        System.out.println();
        return shots;        
    }
    
    public static boolean shotHit(int shots){
        System.out.println("Direct Hit!!!");
        System.out.println("You Win!!!");
        System.out.println("You completed the game in " + shots + " shots!!!");
        return false;        
    }
}
