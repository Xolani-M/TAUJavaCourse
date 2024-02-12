package chapter2;

import java.util.Scanner;

public class MadLib {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---MADLIBS---");
        System.out.println("What is your name?: ");
        String name = scanner.next();

        System.out.println("Hello "+ name + " Enter the the season of the year?: ");
        String season = scanner.next();

        System.out.println("Thank you for participating " +name + ". "+ "Now enter a whole number: ");
        int wholeNum = scanner.nextInt();

        System.out.println("Good job! " + name + ". "+ "Now please enter an adjective: ");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a "+ adjective + " " + season +" day, I drink a minimum of "+ wholeNum + " cups of coffee.");

    }
}