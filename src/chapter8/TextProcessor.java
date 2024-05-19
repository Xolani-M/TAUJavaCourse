package chapter8;

public class TextProcessor {

    public static void main(String[] args){

//        wordCount("My birthday month is September");

//        reverseString("Camel");

        addSpaces("HelloWorld!IAmFromPlanetOz");

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

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        String reversedString = "";
        for(int i = text.length()-1; i> 0; i--){
            reversedString += text.charAt(i);
        }
        System.out.println("Reversed string: " + reversedString);
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i= 0; i <modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){


                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

}
