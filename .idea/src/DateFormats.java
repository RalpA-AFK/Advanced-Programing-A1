import java.util.Scanner;

public class DateFormats {

    public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Write a random date in the format 02/13/2026" );
    String integerDate = scnr.nextLine();
    scnr.close();
    char monthInt1 = 0;
    char monthInt2 = 0;
    char dayInt1 = 0;
    char dayInt2 = 0;
    char yearInt1 = 0;
    char yearInt2 = 0;
    char yearInt3 = 0;
    char yearInt4 = 0;

    int monthValue = 0;
    int dayValue = 0;
    int yearValue = 0;
    String[] months = {"January", "Febuary", "March", "April","May",
    "June","July","August","September","October","November","December"};

    for(int i = 0; i < integerDate.length();i++){
        char cycler = integerDate.charAt(i);
        if(i == 0){
            monthInt1 = integerDate.charAt(i);
        }
        if(i == 1){
            monthInt2 = integerDate.charAt(i);
        }

        monthValue = Integer.parseInt(String.valueOf(monthInt1 + monthInt2));

        if(i == 4){ dayInt1 = integerDate.charAt(i);}
        if(i == 5){dayInt2 = integerDate.charAt(i);}

        dayValue = Integer.parseInt(String.valueOf(dayInt1 +dayInt2));

        if(i == 7){yearInt1 = integerDate.charAt(i);}
        if(i == 8){yearInt2 = integerDate.charAt(i);}
        if(i == 9){yearInt3 = integerDate.charAt(i);}
        if(i == 10){yearInt4 = integerDate.charAt(i);}

        yearValue = Integer.parseInt(String.valueOf(yearInt1 + yearInt2 + yearInt3 + yearInt4));

    }

    System.out.println(months[monthValue-1] + dayValue + ", " + yearValue);

    }

}

