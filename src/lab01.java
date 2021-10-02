
import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String str = input.nextLine();
        System.out.print("You Entered "+ str);
        try {
            int year = Integer.parseInt(str);

        } catch (NumberFormatException e) {
            System.out.println("\n" + str + " is not a number");
            System.exit(1);
        }

        //while (!input.hasNextInt() ){}

        int year = Integer.parseInt(str);

        //System.out.println(year);

        System.out.println(year);
        //int year = 9000;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
/*
Here's  version that  uses nested If statments->
  int year = 1900;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }


            This is a version  that only uses the things stated on the study guide ->
                     int year=2003;
        if(year % 4 !=0){
            System.out.println(year+" is not a leap year");
        }else{
            if(year%100!=0){
                System.out.println(year + " is a leap year");
            }else{
                if(year%400!=0){
                    System.out.println(year+ " is not a leap year");
                }else{
                    System.out.println(year+" is a leap year");
                }
            }
        }

            I also Tried creating a visually compressed version of the code->

                 int year = 1900;
        if (year%4==0 && year%100==0 && year%400==0 || year%4==0 && year%100!=0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
 */

/*
Idk this was scratch paper work space->
  Scanner input = new Scanner(System.in);
         System.out.print("Input: ");
                 String str = input.nextLine();
                 System.out.print(str);

        String str = "25T";
        try{
        int number = Integer.parseInt(str);
        System.out.println(number);
        }
        catch (NumberFormatException ex){
        ex.printStackTrace();
        }




        int year = 2000;
            if(year % 4 != 0){
                System.out.println(year + " is not a leap year.");
            }else if(year % 100 !=0){
                System.out.println(year+ " is a leap year");
            }else if(year % 400 !=0){
                System.out.println(year + " is not a leap year.");
            }else{
                System.out.println(year + " is a leap year.");
            }


 */