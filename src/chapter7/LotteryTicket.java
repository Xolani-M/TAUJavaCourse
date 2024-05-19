package chapter7;

import java.util.Arrays;
import java.util.Random;


public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i =0; i < LENGTH; i++){
            int randomNumber;

            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER);
            }while(search(ticket,randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the arr and find a value
     * @param array array to search through
     * @param numToSearchFor Value to search for
     * @return true if found snd false if not
     */
    public static boolean search(int[] array, int numToSearchFor){
        for(int value: array){
            if(value == numToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static void printTicket(int[] ticket){

        for(int num : ticket){
            System.out.print(num + " " + "| ");
        }
    }
}
