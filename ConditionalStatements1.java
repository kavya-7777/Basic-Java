import java.util.Scanner;

public class ConditionalStatements1{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        long num1 = obj.nextLong();                    //check whether the 2 input are "Equal" or "Not Equal"
        long num2 = obj.nextLong();
        if (num1 == num2) System.out.println("Equal");
        else System.out.println("Not Equal");

        long n = obj.nextLong();                           //check whether it is "Odd" or "Even"
        if(n%2==0) System.out.println("EVEN");
        else System.out.println("ODD");

        int marks = obj.nextInt();                         //print output as Pass/Fail
        if(marks<35) System.out.println("FAIL");
        else System.out.println("PASS");

        long n1 = obj.nextLong();                          //minimum of 2 numbers
        long n2 = obj.nextLong();
        if(n1<n2) System.out.println("Minimum of "+n1+" and "+n2+" is "+n1);
        else System.out.println("Minimum of "+n1+" and "+n2+" is "+n2);

        long num = obj.nextLong();                          //whether the given input is "Positive","Negative" or "Zero"
        if(num<0) System.out.println("NEGATIVE");
        else if(num>0) System.out.println("POSITIVE");
        else System.out.println("ZERO");

        long number = obj.nextLong();                                        //if it is divisible by 3 print “HI”, 
        if(number%3==0 && number%5==0) System.out.println("HIHELLO");        //if it is divisible by 5 print “HELLO”,
        else if(number%3==0) System.out.println("HI");                       //if it is divisible by both print “HIHELLO”
        else if(number%5==0) System.out.println("HELLO");                    //else print "NONE"
        else System.out.println("NONE");

        long stepCount = obj.nextLong();                                     //Find the position after moving by left or right(direction)
        char direction = obj.next().charAt(0);                               //by the specified number of steps(stepCount)
        long x=0,y=0;                                                        //10,L ---> (-10,0)
        if(direction == 'R' || direction == 'r') x = stepCount;
        else if(direction == 'L' || direction == 'l') x = -stepCount;
        System.out.println("("+x+","+y+")");

        char ch = obj.next().charAt(0);                                      //character is a Vowel or Consonant
        if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') || (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) System.out.println("Vowel");
        else System.out.println("Consonant");
    }
}