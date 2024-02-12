package chapter3;

import java.util.Scanner;

/*
* Nested IFS:
* To qualify for a loan, a person must at least make $30,000
* and have been working for the current job for at least 2 years.
*/
public class LoanQualifier {

    public static void main(String[] args){
        //Initialize known values
        int expectedSalary = 30000;
        int expectedYears = 2;

        //Get the unknown values
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount you make a month: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years in your current employer.");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision on the path to take

        if (salary >= expectedSalary){
            if(years >= expectedYears){
                System.out.println("Congrats you qualify for the loan.");
            }
            else{
                System.out.println("Sorry, you must have worked at current employer for a minimum of "
                        + "$" +expectedYears+ " years.");
            }
        }else {
            System.out.println("Sorry, you must earn a minimum of "
                    + "$" + expectedSalary +" to qualify for the loan.");
        }
    }
}
