import java.util.Scanner;

public class SearchForBThroughTokens {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String sentence = scnr.nextLine(); // catches the sentence that we will be cycling through
        scnr.close();
        int index = 0;
        String[] token = sentence.split(" "); // creates the array for each word in the sentence
        String[] tokenB = new String[token.length]; /* creates another array with the same length as
                                                       the array that holds each word */

        for(int i =0; i < token.length; i++ ){ // nested loop cycles through each word in the array and looks
            String currentWord = token[i];     // for words with b
            if(currentWord.contains("b")||currentWord.contains("B") ){
                tokenB[index] = currentWord;
                index++;
            }
        }

        System.out.println("Words containing b: \n");

        for(int i = 0; i < tokenB.length; i++){ // cycles through the array containg the words with b and prints them
            String currentToken = tokenB[i];
            if(currentToken != null) {          // avoiding null pointers
                System.out.print(tokenB[i] + " ");
            }
        }

    }
}
//Test input: Black out the sun and leave everything behind for their is nothing left to be discovered