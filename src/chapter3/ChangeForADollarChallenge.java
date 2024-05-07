package chapter3;

import java.util.Scanner;

/*
* The objective of the game is to enter enough
* change to equal exactly $1.
* Ask the user to enter the quantities for the following coins:
* pennies, nickels, dimes and quarters.
* The program should count up the value of all the change.
* if it's exactly $1, they win. Tell them how much
* they went over or under.
*/
public class ChangeForADollarChallenge {
    public static void main(String[] args){

        //Initialize known values
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        //Get unknown values
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?:");
        double numOfPennies = scanner.nextDouble();

        System.out.println("How many nickels would you like?:");
        double numOfNickels = scanner.nextDouble();

        System.out.println("How many dimes?:");
        double numOfDimes = scanner.nextDouble();

        System.out.println("How many quarters?:");
        double numOfQuarters = scanner.nextDouble();
        scanner.close();

        double change =  numOfPennies * penny + numOfNickels * nickel + numOfDimes *dime + numOfQuarters * quarter;

        //Path decision - output
        if(change == dollar){
            System.out.println("Congrats! You won, your change is equals to a dollar.");
        }else if(change < dollar){
            double changeIsUnder = dollar - change;
            System.out.println("Uh oh! you went under by $" + String.format("%.2f",changeIsUnder));
        }else {
            double changeIsOver = change - dollar;
            System.out.println("Uh oh! Change is over a dollar by $" + String.format("%.2f",changeIsOver));
        }

    }
}
