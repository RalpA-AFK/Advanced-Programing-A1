import java.util.Scanner;

public class MorseEncoder {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type out a full english sentence below witout using any parenthesis comas or the like.");
        String sentence = scnr.nextLine();
        scnr.close();

        //Variables declared below as well as the two alphabet arrays

        int i = 0;
        int x = 0;
        int spaceCount = 0;
        String currentLetter ="";
        char whiteSpace = ' ';
        char[] baseAlphabet = {'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String[] morseAlphabet = {
                ". - ",      // A
                "- . . . ",  // B
                "- . - . ",  // C
                "- . . ",    // D
                ". ",        // E
                ". . - . ",  // F
                "-- . ",     // G
                ". . . . ",  // H
                ". . ",      // I
                ". - - - ",  // J
                "- . - ",    // K
                ". - . . ",  // L
                "-- ",       // M
                "- . ",      // N
                "--- ",      // O
                ". - - . ",  // P
                "-- . - ",   // Q
                ". - . ",    // R
                ". . . ",    // S
                "- ",        // T
                ". . - ",    // U
                ". . . - ",  // V
                ". - - ",    // W
                "- . . - ",  // X
                "- . - - ",  // Y
                "-- . . "    // Z
        };

        while(i < sentence.length()){
            char sentenceChar = Character.toUpperCase(sentence.charAt(i)); // changes all char's to uppercase for array use
            x = 0;                                                         // reset x value
            if(sentenceChar == whiteSpace){                                // triple space after every word
                System.out.print("   ");
                spaceCount++;
                if(spaceCount % 2 == 0){System.out.print("\n");}           // helps indent so the output isnt to long
                i++;
                continue;                                                  // breaks the loop and moves to next iteration

            }
            while(sentenceChar != baseAlphabet[x]){                        // cycles through baseAlphabet to find what
                x++;                                                       // letter sentenceChar is
            }
            currentLetter = morseAlphabet[x];                              // makes currentLetter the morseCode version
            System.out.print(currentLetter);
            i++;
        }
    }
}
