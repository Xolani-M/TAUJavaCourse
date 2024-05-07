package chapter2;

import java.util.Scanner;

public class MadLib {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Get adjective
        System.out.println("Input adjective: ");
        String adjective = scanner.nextLine();

        //Get the season of the year
        System.out.println("Input the season of the year: ");
        String season = scanner.nextLine();

        //Get whole number
        System.out.println("Input a whole number: ");
        int wholeNumber = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee." );


    }
}