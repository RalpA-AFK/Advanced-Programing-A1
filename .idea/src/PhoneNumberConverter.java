import java.util.Scanner;
public class PhoneNumberConverter {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type out a phone number in the form (555) 555-5555");
        String phoneNumber = scnr.nextLine();
        scnr.close();
        String[] tokens = phoneNumber.split(" ");
        System.out.println("Area code: " + tokens[0] + "\nNumber: " + tokens[1] + "\nPhone Number:" + phoneNumber);


    }
}
