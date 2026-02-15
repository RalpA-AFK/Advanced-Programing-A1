import java.util.Scanner;
public class PhoneNumberConverter {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type out a phone number in the form (555) 555-5555");
        String phoneNumber = scnr.nextLine();
        scnr.close();
        String[] tokens1 = phoneNumber.split("\\)");
        String split1 = tokens1[0];                   // stores (646
        String[] tokens2 = split1.split("\\("); // used to get rid of the beginning parenthesis stores 646
        String[] token = phoneNumber.split("-");// stores (646) 799 and 7977
        String split2 = token[0];                     // stores (646) 799
        String[] token2 = split2.split(" ");    // stores (646) and 799
        System.out.println("Area code: " + tokens2[1] + "\nNumber: " + token2[1] +
                          token[1] + "\nPhone Number:" + phoneNumber);

        //tokens2[1] = 646 , token2[1] = 799 , token[1] = 7077 , phoneNumber = (646) 799-7977
    }
}
//Test input : (646) 799-7977