import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int day = obj.nextInt();
        String dayString;
        String dayType;

        switch(day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString="Invalid day";
        }

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid day";

        }
        System.out.println(dayString+" is a "+dayType);

        //switch expressions and case labels as "expressions"
        int x = 2;
        switch(x+1){                             // variables can be used in switch expressions
            case 1:
                System.out.println(1);
                break;
            case 1+1:                            // variables should not be used in case labels
                System.out.println(2);           // only constants and literals
                break;
            case 2+1:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");
        }
    }
}