import java.util.Scanner;
public class PhoneNumberConverter {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type out a phone number in the form (555) 555-5555");
        String phoneNumber = scnr.nextLine();
        scnr.close();
        String[] tokens1 = phoneNumber.split("\\)");
        String split1 = tokens1[0];
        String[] tokens2 = split1.split("\\(");
        String[] token = phoneNumber.split("-");
        String split2 = token[0];
        String[] token2 = split2.split(" ");
        System.out.println("Area code: " + tokens2[1] + "\nNumber: " + token2[1] + token[1] + "\nPhone Number:" + phoneNumber);
    }
}
//(555) 555-5555