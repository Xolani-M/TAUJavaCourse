package chapter8;

public class TextProcessor {

    public static void main(String[] args){

        wordCount("My birthday month is September");


    }

    /**
     * Splits a String into an array by tokenizing it.
     * Count's words and prints them
     * @param text full string to be split
     */
    public static void wordCount(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);

        System.out.println(message);

        for(int i =0;i < numberOfWords;i++ ){
            System.out.println(words[i]);
        }
    }


}
