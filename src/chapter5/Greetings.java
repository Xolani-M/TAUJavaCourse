package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        //Get username
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter you name: ");
        String name = scanner.nextLine();

        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
