package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputBox = new Scanner(System.in);
        while(true){
            int choice1;
            int choice2;
            int quit = 0;
            String selection1 = "";
            String selection2 = "";

            //System.out.println(computer_num);
            System.out.println("Welcome to Rock, Paper, Scissors");
            System.out.println("Player 1 please make a selection (0) for Rock, (1) for Paper, or (2) for Scissors: ");
            choice1 = inputBox.nextInt();
            if(choice1 == 0){
                selection1 = "Rock";
            }else if(choice1 == 1){
                selection1 = "Paper";
            }else if(choice1 ==2){
                selection1 = "Scissors";
            }
            System.out.println("Player 2 please make a selection (0) for Rock, (1) for Paper, or (2) for Scissors: ");
            choice2 = inputBox.nextInt();
            if(choice2 == 0){
                selection2 = "Rock";
            }else if(choice2 == 1){
                selection2 = "Paper";
            }else if(choice2 ==2){
                selection2 = "Scissors";
            }
            if(choice1 == choice2){
                System.out.println("It's a draw! You both chose the number " + choice1 + " which is " + selection1 +".");
            }else if((choice1 == 2 &&  choice2 == 1  && choice1 < 3) || (choice1 == 0 && choice2 == 2 && choice1 <3) || (choice1 == 1 && choice2 == 0 && choice1 <3) ){
                System.out.println("Player 1 wins!! Your " + selection1 + " beats Player 2's " + selection2 + "!!");
            }else if((choice1 == 1 && choice2 == 2 && choice1 < 3) || (choice1 == 0 && choice2 == 1 && choice1 <3) || (choice1 == 2 && choice2 == 0 && choice1 <3)){
                System.out.println("Player 2 wins!! Your " + selection1 + " has beaten Player 1's  " + selection2 + "!!");
            }else{
                System.out.println("Oops, that is not a valid entry please try again!");
            }
            System.out.println("Enter (-1) to quit or (1) to play again");
            quit = inputBox.nextInt();
            if(quit == -1){
                break;
            }
        }


    }
}
