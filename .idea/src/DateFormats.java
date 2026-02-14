import java.util.Scanner;

public class DateFormats {

    public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Write a random date in the format 02/13/2026" );
    String integerDate = scnr.nextLine();
    scnr.close();
    String[] months = {"January", "Febuary", "March", "April","May",
    "June","July","August","September","October","November","December"};

    for(int i = 0; i < integerDate.length();i++){
    char cycler = integerDate.charAt(i);
    while(i < 2){
       String stringMonth = String.valueOf(integerDate.charAt(i));

    }
    }

    }
}

