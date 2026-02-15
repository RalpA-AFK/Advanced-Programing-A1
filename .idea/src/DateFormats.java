import java.util.Scanner;

public class DateFormats {

    public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Write a random date in the format 02/13/2026" );
    String integerDate = scnr.nextLine();
    scnr.close();

    // All variable decleration below

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
    String[] months = {"January", "February", "March", "April","May",
    "June","July","August","September","October","November","December"};

// Below cycles through char values to find the month date and year as an int value

    for(int i = 0; i < integerDate.length();i++){
        char cycler = integerDate.charAt(i);
        if(i == 0){monthInt1 = integerDate.charAt(i);}
        if(i == 1){monthInt2 = integerDate.charAt(i);}
        if(i == 3){ dayInt1 = integerDate.charAt(i);}
        if(i == 4){dayInt2 = integerDate.charAt(i);}
        if(i == 6){yearInt1 = integerDate.charAt(i);}
        if(i == 7){yearInt2 = integerDate.charAt(i);}
        if(i == 8){yearInt3 = integerDate.charAt(i);}
        if(i == 9){yearInt4 = integerDate.charAt(i);}
    }

    //Below int values are combined and used to find the day month and year values.

    dayValue = Integer.parseInt("" + dayInt1 + dayInt2);
    monthValue = Integer.parseInt("" + monthInt1 + monthInt2);
    yearValue = Integer.parseInt("" +yearInt1 + yearInt2 + yearInt3 + yearInt4);

    /* monthValue-1 is used to cycle through the month array and print
       out the actual month while the rest simply print int values */
    System.out.println(months[monthValue-1] +" " + dayValue + ", " + yearValue);

    }

}

