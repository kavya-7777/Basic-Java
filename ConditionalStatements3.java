import java.util.Scanner;

public class ConditionalStatements3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();                                       //whether a triangle is Equilateral or Isosceles or Scalene
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

        int angle1 = scanner.nextInt();                                      //check angles of a Triangle whether "Valid" or not
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        if ((angle1 + angle2 + angle3 == 180) && angle1 != 0 && angle2 != 0 && angle3 != 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

        long num1 = scanner.nextLong();                                      //minimum of 3 numbers
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        long mini;
        if(num1<num2 && num1<num3) mini = num1;
        else if(num2<num3) mini = num2;
        else mini = num3;
        System.out.println("Minimum is "+mini);

        long a = scanner.nextLong();                                      //maximum of 3 numbers
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long maxi;
        if(a>b && a>c) maxi = a;
        else if(b>c) maxi = b;
        else maxi = c;
        System.out.println("Maximum is "+maxi);

        long n1 = scanner.nextLong();                                        //maximum of 4 input numbers 
        long n2 = scanner.nextLong();
        long n3 = scanner.nextLong();
        long n4 = scanner.nextLong();
        long maximum;
        if(n1>n2 && n1>n3 && n1>n4) maximum=n1;
        else if(n2>n3 && n2>n4) maximum=n2;
        else if(n3>n4) maximum=n3;
        else maximum=n4;
        System.out.println("Largest is "+maximum);

        long x = scanner.nextLong();                                         //3 integer values in ascending order
        long y = scanner.nextLong();
        long z = scanner.nextLong();
        long max = Math.max(Math.max(x, y), z);
        long min = Math.min(Math.min(x, y), z);
        long mid = x + y + z - max - min;
        System.out.printf("%d < %d < %d", min, mid, max);

        long no1 = scanner.nextLong();                                       //4 input numbers in descending order
        long no2 = scanner.nextLong();
        long no3 = scanner.nextLong();
        long no4 = scanner.nextLong();
        long max1 = Math.max(Math.max(no1,no2),Math.max(no3,no4));
        long min1 = Math.min(Math.min(no1,no2),Math.min(no3,no4));
        long min2 = Math.min(Math.max(no1,no2),Math.max(no3,no4));
        long max2 = Math.max(Math.min(no1,no2),Math.min(no3,no4));
        if(min2 > max2){
            long temp = min2;
            min2 = max2;
            max2 = temp;
        }
        System.out.printf("%d > %d > %d > %d", max1, max2, min2, min1);

        int choice1 = scanner.nextInt();                                   //min and max values of the data types
        int choice2 = scanner.nextInt();
        if (choice1 == 1) 
        { 
            switch (choice2) 
            {
                case 1:
                    System.out.println("Minimum value of signed char is " + (byte) Byte.MIN_VALUE);
                    System.out.println("Maximum value of signed char is " + (byte) Byte.MAX_VALUE);
                    break;
                case 2:
                    System.out.println("Minimum value of signed short int is " + Short.MIN_VALUE);
                    System.out.println("Maximum value of signed short int is " + Short.MAX_VALUE);
                    break;
                case 3:
                    System.out.println("Minimum value of signed int is " + Integer.MIN_VALUE);
                    System.out.println("Maximum value of signed int is " + Integer.MAX_VALUE);
                    break;
                case 4:
                    System.out.println("Minimum value of signed long int is " + Long.MIN_VALUE);
                    System.out.println("Maximum value of signed long int is " + Long.MAX_VALUE);
                    break;
                case 5:
                    System.out.println("Minimum value of signed long long int is " + Long.MIN_VALUE);
                    System.out.println("Maximum value of signed long long int is " + Long.MAX_VALUE);
                    break;
            }
        } 
        else 
        {
            switch (choice2) 
            {
                case 1:
                    System.out.println("Minimum value of unsigned char is 0");
                    System.out.println("Maximum value of unsigned char is " + ((int) Character.MAX_VALUE));
                    break;
                case 2:
                    System.out.println("Minimum value of unsigned short int is 0");
                    System.out.println("Maximum value of unsigned short int is " + 0xFFFF); 
                    break;
                case 3:
                    System.out.println("Minimum value of unsigned int is 0");
                    System.out.println("Maximum value of unsigned int is " + Integer.toUnsignedString(-1)); 
                    break;
                case 4:
                    System.out.println("Minimum value of unsigned long int is 0");
                    System.out.println("Maximum value of unsigned long int is " + Long.toUnsignedString(-1L));
                    break;
                case 5:
                    System.out.println("Minimum value of unsigned long long int is 0");
                    System.out.println("Maximum value of unsigned long long int is " + Long.toUnsignedString(-1L)); 
                    break;
            }
        }

        scanner.nextLine();

        String time = scanner.nextLine();                                    //valid time or not
        String[] parts = time.split(":");
        if(parts.length != 3){
          System.out.println("Not Valid");
          //return;
        }
        try{
          int hour=Integer.parseInt(parts[0]);
          int mins=Integer.parseInt(parts[1]);
          int sec=Integer.parseInt(parts[2]);
          
          if( (hour>=0 && hour<24) && (mins>=0 && mins<60) && (sec>=0 && sec<60) )
            System.out.println("Valid");
          else
            System.out.println("Not Valid");
        }
        catch(Exception e){
          System.out.println("Not Valid");
        }

        String input = scanner.nextLine();                                   //valid date or not
        String[] part = input.split("/");
        if (part.length != 3) {
            System.out.println("Invalid date format");
            //return;
        }
        int date = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[2]);
        boolean isValid = false;
        if ( (date > 0 && date < 32) && (month > 0 && month < 13) && (year > 0 && year < 10000) ) {
            if (date < 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                isValid = true;
            } 
            else if (date < 32 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
                isValid = true;
            } 
            else if (month == 2) {
                if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                    if (date <= 29) isValid = true;
                    }
                    else {
                        if (date <= 28) isValid = true;
                    }
            }
        }
        if(isValid) System.out.println("Valid");
        else System.out.println("Invalid");

    }
}