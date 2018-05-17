/* Question 8
        Define a function called monopolyRoll(). This function provides a random result based on
        the dice-rolling rules for the board game Monopoly. In Monopoly, players roll two six-sided
        dice to determine their move. If they roll the same value on both dice, this is called “rolling
        doubles,” and it means they go again. In our simplified version, the dice-roll function should
        behave like this:
        1. Generate two random integers in the 1 to 6 range.
        2. If the numbers are not the same, return the sum.
        3. If the numbers are the same, generate two more random integers in the 1 to 6 range,
        and return the sum of all 4 numbers.
        Hint: to make your code neater, you can define a second function that generates a random
        integer in the 1 to 6 range (or in the 1 to x range based on a parameter) so that you do not
        need to keep repeating that code. */
package com.company;

public class Main {
         public static void main(String[] args){

            System.out.println(mainRoll());

        }
        public static int rollDice (int sides){
            double roll = Math.random();
            roll = (roll * sides) + 1;
            int rollInt = (int) roll;
            return rollInt;
        }
        public static int mainRoll (){
            int rollOne = rollDice (6);
            int rollTwo = rollDice (6);
            int rollSum = rollOne + rollTwo;
            if (rollOne == rollTwo) {
                int rollThree = rollDice(6);
                int rollFour = rollDice(6);
                rollSum = rollOne + rollTwo + rollThree + rollFour;
            }
            return rollSum;


        }
    }