package chapter3;


import java.util.Scanner;

/*
* IF ELSE
* All sales people are expected to make at least 10 sales each week.
* For those who do, they receive a congratulatory message.
* For those who don't they are informed how many sales they were short.
 */
public class QuotaCalculator {

    public static  void main(String[] args){
        // Initiate what we know
        int quota = 10;
        int sale = 1;

        //Get unknown values
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sales you made this week: ");
        int employeeSales= scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if(employeeSales >= quota)
            System.out.println("Congrats! You have met you quota.");
        else{
            int salesShort = quota - employeeSales;
            if(salesShort == sale)
                System.out.println("You did not make your quota. You were " + salesShort + " sale short.");
            else{
                System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
            }
        }

    }

}
