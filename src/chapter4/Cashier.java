package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args){
        System.out.println("Enter the number of items you wish to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i =0; i < quantity; i++){
            System.out.println("Enter the cost of the item: "+ ( i +1));
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();
        System.out.println("The total is: " + total);

    }
}
