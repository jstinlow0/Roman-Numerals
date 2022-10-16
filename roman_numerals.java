
/**
 * @author: Justin Lo
 * @version 1.15
 * @since 2022-01-27
 * Descritpion: Prompts user for an integer between 1 and 3999. The program should then convert the number input to a Roman numeral.
 */

import java.util.Scanner;

public class roman_numerals {
    public static void main(String[] args) {

        //initializing constant variables
        final String ONE = "I";
        final String FOUR = "IV";
        final String FIVE = "V";
        final String NINE = "IX";
        final String TEN = "X";
        final String FOURTY = "XL";
        final String FIFTY = "L";
        final String NINETY = "XC";
        final String HUNDRED = "C";
        final String FOUR_HUNDRED = "CD";
        final String FIVE_HUNDRED = "D";
        final String NINE_HUNDRED = "MD";
        final String THOUSAND = "M";


        Scanner input = new Scanner(System.in); //Scanner object
        System.out.print("Please enter a number between 1 - 3999 >> "); //prompts user for question
        int userInput = input.nextInt(); //makes sure that the user inpuit is only an integer

        // error handling if number is over or under 1 - 3999
        while (userInput > 3999 || userInput < 1) {
            System.out.println("Invalid number.");
            System.out.print("Please enter a number between 1 - 3999 >> "); // prompts user for question AGAIN
            userInput = input.nextInt();
        }

        input.close(); //close scanner object.



        String romanNumber = ""; //make a string outside of loop to be made into the roman numeral numbers. 

        //while userInput != 0, then enter loop
        while(userInput != 0) {
            
            //while user input is still greater than 1000, add THOUSAND to romanNumber. Subtract 1000 from user input to move onto the next While-loop. 
            while(userInput >= 1000){
                romanNumber += THOUSAND;
                userInput -= 1000;
            }
            while(userInput >= 900){
                romanNumber += NINE_HUNDRED;
                userInput -= 900;
            }
            while(userInput >= 500){
                romanNumber += FIVE_HUNDRED;
                userInput -= 500;
            }
            while(userInput >= 400) {
                romanNumber += FOUR_HUNDRED;
                userInput -= 400;
            }
            while (userInput >= 100) {
                romanNumber += HUNDRED;
                userInput -= 100;
            }
            while (userInput >= 90) {
                romanNumber += NINETY;
                userInput -= 90;
            }
            while (userInput >= 50) {
                romanNumber += FIFTY;
                userInput -= 50;
            }
            while (userInput >= 40) {
                romanNumber += FOURTY;
                userInput -= 40;
            }
            while (userInput >= 10) {
                romanNumber += TEN;
                userInput -= 10;
            }
            while (userInput >= 9) {
                romanNumber += NINE;
                userInput -= 9;
            }
            while (userInput >= 5) {
                romanNumber += FIVE;
                userInput -= 5;
            }
            while (userInput >= 4) {
                romanNumber += FOUR;
                userInput -= 4;
            }
            while (userInput >= 1) {
                romanNumber += ONE;
                userInput -= 1;
            }
        }

        System.out.print("Your number in roman numeral is >> " + romanNumber);
    }
}
