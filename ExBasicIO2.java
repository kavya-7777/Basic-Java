import java.util.Scanner;

public class ExBasicIO2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        long x = obj.nextLong();                       //absolute difference
        long y = obj.nextLong();
        long num = x-y;
        System.out.println(Math.abs(num));

        int n1 = obj.nextInt();                       //print quotient  with 16 decimal places and the remainder
        int n2 = obj.nextInt();
        double quotient = (double) n1/n2;
        int remainder = n1%n2;
        System.out.printf("The quotient when %d is divided by %d is %.16f\n",n1,n2,(double)n1/n2);
        System.out.printf("The remainder when %d is divided by %d is %d",n1,n2,(n1%n2));

        int a = obj.nextInt();                        //Swap two numbers with temporary variable
        int b = obj.nextInt();
        int temp = a;
        a = b;
        b = temp; 
        System.out.print("num1="+a+"\n"+"num2="+b);

        int num1 = obj.nextInt();                     //Swap two numbers without temporary variable
        int num2 = obj.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);

        int n = obj.nextInt();                       //Accept a number which will be 1 or 2,
        //char res = (n==1)?'2':'1';                 //If it is 1, print 2. If it is 2, print 1.
        int res = 3-n;
        System.out.print(res);
    }
}