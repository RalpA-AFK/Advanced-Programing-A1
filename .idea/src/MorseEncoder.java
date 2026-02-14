import java.util.Scanner;

public class MorseEncoder {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type out a full english sentence below witout using any parenthesis comas or the like.");
        String sentence = scnr.nextLine();
        scnr.close();
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
            char sentenceChar = Character.toUpperCase(sentence.charAt(i));
            x = 0;
            if(sentenceChar == whiteSpace){
                System.out.print("   ");
                spaceCount++;
                if(spaceCount % 2 == 0){System.out.print("\n");}
                i++;
                continue;

            }
            while(sentenceChar != baseAlphabet[x]){
                x++;
            }
            currentLetter = morseAlphabet[x];
            System.out.print(currentLetter);
            i++;
        }
    }
}
