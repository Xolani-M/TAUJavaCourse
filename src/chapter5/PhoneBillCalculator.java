package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    //Initialize known values
    static int tax = 15;
    static double overageCharge = 0.25;

    //Scanner for user input
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //Get plan fee
        double planFee = getPlanFee();

        //Get number of overage minutes
        int overageMinutes = getOverageMinutes();

        //Charge the user for every minute
        double overageFee = calculateOverageFees(overageMinutes);

        //final total
        double total = calculateTotal(planFee,overageFee);

        //Tax on the subtotal
        double subTotalTax = calculateTax(total);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + planFee);
        System.out.println("Overage: "+ overageFee);
        System.out.println("Tax: "+ subTotalTax);
        System.out.println("Total: "+ (total + subTotalTax));

    }

    public static double getPlanFee(){
        System.out.println("Enter your phone bill plan fee: ");
        double planFee = scanner.nextDouble();

        return planFee;
    }

    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();

        return overageMinutes;
    }

    public static double calculateOverageFees(int overageMinutes){
        double overageFee =  overageCharge * overageMinutes;
        return  overageFee;
    }

    public static double calculateTotal(double planFee, double overageFee){
        double total = planFee + overageFee;
        return total;
    }

    public static double calculateTax(double total){
        double subtotalTax = total * tax / 100;
        return subtotalTax;
    }
}
