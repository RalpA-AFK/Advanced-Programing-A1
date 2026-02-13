import java.util.Random;

public class RandomSentenceGenerator {
    public static String RandomSentenceGenerator(){

        Random num = new Random();

        String[] articleArray1 ={"The", "A", "One", "Some" , "Any"} ;
        String[] articleArray2 ={"the", "a", "one", "some", "any"};
        String[] nounArray = {"boy", "girl", "dog", "town", "car"};
        String[] verbArray = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositionArray = {"to", "from", "over", "under", "on"};

        for(int i = 0; i <= 20; i++){
            System.out.print(articleArray1[num.nextInt(0,4)] + " ");
            System.out.print(nounArray[num.nextInt(0,4)] + " ");
            System.out.print(verbArray[num.nextInt(0,4)] + " ");
            System.out.print(prepositionArray[num.nextInt(0,4)] + " ");
            System.out.print(articleArray2[num.nextInt(0,4)] + " ");
            System.out.print(nounArray[num.nextInt(0,4)] + ".\n");
        }
        return "\n";
    }

    public static void main(String[] args){

        RandomSentenceGenerator();




    }
}
