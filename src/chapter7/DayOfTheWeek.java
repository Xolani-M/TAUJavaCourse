package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args){
        String[] daysOfTheWeek = {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7) corresponding the day of the week: ");

        int dayNum = scanner.nextInt();

        System.out.println("The day of the week is: " + daysOfTheWeek[dayNum - 1]);

    }
}
