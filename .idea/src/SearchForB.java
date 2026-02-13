import java.util.Scanner;
import java.util.ArrayList;

public class SearchForB {

    public static void main(String[] args){
        // variable decleration below
        Scanner scnr = new Scanner(System.in);
        String sentence = scnr.nextLine();
        System.out.println("Input recieved: " + sentence);
        scnr.close();
        char whitespace = ' ';
        char lowerFound = 'b';
        char upperFound = 'B';
        char letterSearch;
        ArrayList<String> arrayOfB = new ArrayList<>();

        // start of loop

        for(int i = 0; i < sentence.length(); i++){

            letterSearch = sentence.charAt(i); // stores the first character in sentence string
            if(letterSearch == lowerFound || letterSearch == upperFound){

                String valueB = ""; // reset the value so old words dont get stored again

                while(i < sentence.length() && sentence.charAt(i) != whitespace){ //this helps store the whole word
                    valueB += sentence.charAt(i);
                    i++;
                }

                arrayOfB.add(valueB); //adds the completed word to the array if their is no word it adds nothing

            }

        }
        System.out.println(arrayOfB);
    }
}
