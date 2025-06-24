import java.util.Scanner;

public class ExBasicIO3{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int sec = obj.nextInt();                        //read the total seconds and print time format Example :hr:min:sec
        int hours = sec/(60*60);
        sec=sec%(60*60);
        int minutes = sec/60;
        int seconds = sec%60;
        System.out.printf("%02d:HOUR %02d:MIN %02d:SEC",hours,minutes,seconds);

        long Day = obj.nextLong();                      //calculate number of years,weeks,remaining days for the given total days
        long year = Day / 365;
        Day = Day % 365;
        long week = Day / 7;
        long days = Day % 7;
        System.out.println("Number of Years:"+year);
        System.out.println("Number of Week:"+week);
        System.out.println("Number of Days:"+days);

        double celsius = obj.nextDouble();              //convert Celsius into Fahrenheit
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.printf("%.2fF", fahrenheit);

        double degree = obj.nextDouble();               //Convert Degree into Radian
        double radian = degree * (Math.PI / 180.0);
        System.out.printf("%.2f", radian);

        double inches = obj.nextDouble();               //Covert Inches into feet
        double feet = inches * 0.08333;
        System.out.printf("%.2f", feet);
    }
}