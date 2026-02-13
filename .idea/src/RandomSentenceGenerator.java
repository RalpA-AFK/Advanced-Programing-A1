import java.util.Random;

public class RandomSentenceGenerator {
    public static String RandomSentenceGenerator(){

        Random num = new Random();

        String[] articleArray ={"The", "A", "One", "Some" , "Any"} ;
        String[] nounArray = {"boy", "girl", "dog", "town", "car"};
        String[] verbArray = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositionArray = {"to", "from", "over", "under", "on"};

        for(int i = 0; i <= 20; i++){
           /* System.out.print(articleArray[num.nextInt(0,4)] + " ");
            System.out.print(nounArray[num.nextInt(0,4)] + " ");
            System.out.print(verbArray[num.nextInt(0,4)] + " ");
            System.out.print(prepositionArray[num.nextInt(0,4)] + " ");
            System.out.print(articleArray[num.nextInt(0,4)] + " ");
            System.out.print(nounArray[num.nextInt(0,4)] + "."); */
        }
        return "\n";
    }

    public static void main(String[] args){
        Random num = new Random();

        System.out.println(num.nextInt(0,4));

        RandomSentenceGenerator();




    }
}
