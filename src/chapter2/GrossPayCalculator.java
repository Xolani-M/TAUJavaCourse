package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        //Get the number of hours worked
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input employee hours worked: ");
        int hoursWorked = scanner.nextInt();

        //Get the hourly rate
        System.out.println("Input employee hourly rate: ");
        double rate = scanner.nextDouble();

        //Multiply hourly rate by hours worked

        double grossPay = hoursWorked * rate;

        //Display result
        System.out.println("Employee gross pay is equal to: $" + grossPay);
    }
}
