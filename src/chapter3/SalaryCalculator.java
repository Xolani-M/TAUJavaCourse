package chapter3;

import java.util.Scanner;

/*
If Statement.
All sales people get a payment of $1000 a week.
Sales people who exceeded 10 sales get an additional bonus of $250.
 */

public class SalaryCalculator {

    public static void main(String[] args){
        //Initial known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get what I don't know

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name: ");

        String employee = scanner.next();
        System.out.println("Enter number of sales made: ");
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary += bonus;
        }

        //output
        System.out.println("Hello " + employee + "." + " Your salary is for this week "+ "$" +salary + " for this week.");

    }
}



