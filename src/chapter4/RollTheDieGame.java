package chapter4;

import java.util.Random;


public class RollTheDieGame {
    public static void main(String[] args){
        //Initialize known values
        int boardSpaces = 20;
        int currentSpace = 0;
        int dieRolls = 5;

        //Generate random number between 1 - 6
        Random random = new Random();


        for (int i = 1; i <= dieRolls; i++){
            int die = random.nextInt(6) +1;
            currentSpace += die;
            System.out.print("Roll #"+ i+ ": ");

            if (currentSpace == boardSpaces){
                System.out.println("You've rolled a " +die +  ". You're on board space "+ currentSpace  +". Congrats, you win!");
                break;
            }else if (currentSpace > boardSpaces ){
                if (currentSpace == 21){
                    System.out.println("You've rolled a " +die +  ". Uh uh, you went overboard by,"+ (currentSpace-boardSpaces) + " space. Game Over!");
                }else{
                    System.out.println("You've rolled a " +die +  ". Uh uh, you went overboard by,"+ (currentSpace-boardSpaces) + " spaces. Game Over!");
                }

                break;
            }else if (i == dieRolls && currentSpace < boardSpaces) {
                System.out.println("Uh oh. You have reached your limit to roll the die. You missed the goal by " +(boardSpaces-currentSpace) + " board spaces. Game Over!");

            }
            else {
                System.out.println("You've rolled a "+ die + ". You are now on space " + currentSpace + " and " + (boardSpaces-currentSpace) +" more to go.");
            }

            }
        }

}
