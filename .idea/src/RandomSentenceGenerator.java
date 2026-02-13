import java.util.Random;

public class RandomSentenceGenerator {
    public static String RandomSentenceGenerator(){

        Random num = new Random();
        // Below are the arrays that I will be cycling through
        String[] articleArray1 ={"The", "A", "One", "Some" , "Any"} ;
        String[] articleArray2 ={"the", "a", "one", "some", "any"}; // used 2 of them so i wont have to worry about grammar issues
        String[] nounArray = {"boy", "girl", "dog", "town", "car"};
        String[] verbArray = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositionArray = {"to", "from", "over", "under", "on"};

        //Loop statment used to print out the sentence 20 times over done using itteration

        for(int i = 0; i <= 20; i++){
            System.out.print(articleArray1[num.nextInt(0,4)] + " ");
            System.out.print(nounArray[num.nextInt(0,4)] + " ");
            System.out.print(verbArray[num.nextInt(0,4)] + " ");
            System.out.print(prepositionArray[num.nextInt(0,4)] + " ");
            System.out.print(articleArray2[num.nextInt(0,4)] + " ");
            System.out.print(nounArray[num.nextInt(0,4)] + ".\n");
        }

        // Below is the return statement to stop any missing return statement errors
        return "\n";
    }

    public static void main(String[] args){

        RandomSentenceGenerator(); // calls method




    }
}
