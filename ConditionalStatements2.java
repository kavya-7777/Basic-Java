import java.util.Scanner;

public class ConditionalStatements2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        long year = obj.nextLong();                                          // leap year or not
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");
        }
 
        int day_num = obj.nextInt();                                         //print corresponding day
        switch(day_num){
          case 0:
            System.out.println("Sunday");
            break;
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          default:
            System.out.println("Invalid");
            break;
        }

        int month_num = obj.nextInt();                                           //print the respective month name
        switch(month_num){
          case 1:
            System.out.println("January");
            break;
          case 2:
            System.out.println("February");
            break;
          case 3:
            System.out.println("March");
            break;
          case 4:
            System.out.println("April");
            break;
          case 5:
            System.out.println("May");
            break;
          case 6:
            System.out.println("June");
            break;
          case 7:
            System.out.println("July");
            break;
          case 8:
            System.out.println("August");
            break;
          case 9:
            System.out.println("September");
            break;
          case 10:
            System.out.println("October");
            break;
          case 11:
            System.out.println("November");
            break;
          case 12:
            System.out.println("December");
            break;
          default:
            System.out.println("Invalid");
            break;
        }

        char letter = obj.next().charAt(0);                  // upper case or lower case or none 
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("LOWERCASE");
        } else if (letter >= 'A' && letter <= 'Z') {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("NONE");
        }

        int salary = obj.nextInt();                          //Basic Salary <= 10000 : HRA = 20%, DA=80%
        double grossSalary = 0.00;                           //Basic Salary <= 20000 : HRA = 25%, DA=90%
        if(salary<=10000)                                    //Basic Salary > 20000 : HRA = 30%, DA=95%
          grossSalary = salary+salary*0.2+salary*0.8;
        else if(salary>10000 && salary<=20000)
          grossSalary = salary+salary*0.25+salary*0.90;
        else if(salary>20000)
          grossSalary = salary+salary*0.30+salary*0.95;
        System.out.printf("Rs.%.2f",grossSalary);

        char ch = obj.next().charAt(0);                       //alphabet or a number or special character
        if (ch >= '0' && ch <= '9') {
            System.out.println("NUMBER");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("ALPHABET");
        } else {
            System.out.println("SPECIAL CHARACTER");
        }

        int mark = obj.nextInt();                             //marks>=91       -->   A
        switch (mark) {                                       //76<=marks<=90   -->   B
            case 91:                                          //61<=marks<=75   -->   C
            case 92:                                          //marks<=60       -->   D
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                System.out.println("Grade A");
                break;
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                System.out.println("Grade B");
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Grade D");
                break;
        }

        int num1 = obj.nextInt();                            //Perform the operation with the integer values
        char op = obj.next().charAt(0);                      //based on the character(+,-,*,/)
        int num2 = obj.nextInt();
        int ans = 0;
        switch(op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
        }
        System.out.println(ans);

        int number = obj.nextInt();                                                       //electricity bill
        double bill;                                                                       //For First 50 Units Rs.0.50/unit
        if (number > 250) {                                                               //For next 100 Units Rs.0.75/unit
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (number - 250) * 1.50;      //For next 150 Units Rs.1.20/unit
        } else if (number > 150) {                                                        //For unit above 250 Rs.1.50/unit
            bill = (50 * 0.50) + (100 * 0.75) + (number - 150) * 1.20;                     //additional surcharge of 20%
        } else if (number > 50) {
            bill = (50 * 0.50) + (number - 50) * 0.75;
        } else {
            bill = number * 0.5;
        }
        bill = bill + (bill * 0.2);
        System.out.printf("%.2f", bill);

        long s1 = obj.nextLong();                                              //whether the given three sides can form a triangle or not.
        long s2 = obj.nextLong();
        long s3 = obj.nextLong();
        if ((s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }   

    }
}