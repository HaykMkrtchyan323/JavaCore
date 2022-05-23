package chapters.chapter5;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args)
    throws java.io.IOException{
        String season;
       int month = (int) System.in.read();
        if(month == 12 || month == 1 || month == 2){
            season = "Winter";
        }
        else if(month == 3 || month == 4 || month == 5){
            season = "Spring";
        }
        else if(month == 6 || month == 7 || month == 8){
            season = "Summer";
        }
        else if (month == 9 || month == 10 || month == 11){
            season = "Autumn";
        }
        else {
            season = "Bogus month";
        }

        System.out.println( "it is  " + season);

    }
}
