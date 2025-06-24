import java.util.Scanner;

public class ExBasicIO1{
    public static void main(String[] args){
        System.out.println("Success is when your \"signature\" becomes \"autograph\"");
        System.out.println("\\n");
        System.out.println("%%");
        System.out.println("\\");

        Scanner obj = new Scanner(System.in);           //Read an integer and print 
        long n = obj.nextLong();
        System.out.println(n);

        char ch = obj.next().charAt(0);                 //Accept a character and print
        System.out.println(ch);

        long n1 = obj.nextLong();                       //first number as a 5-digit number
        long n2 = obj.nextLong();                       //second number with 5 width space
        System.out.printf("%05d\n",n1);
        System.out.printf("%5d",n2);

        long val = obj.nextLong();                      //print the number along with its sign
        System.out.printf("%+d", val);

        char character = obj.next().charAt(0);          //Accept a character and print its corresponding ASCII value
        int ascii = character;
        System.out.println(ascii);

        int nchar = obj.nextInt();                      //Accept an integer value and print the corresponding character
        System.out.println(nchar+":"+(char)nchar);

        double decimal = obj.nextDouble();              //Round off floating point value with accurate to 2 decimal places.
        System.out.printf("%.2f",decimal);

        double dec = obj.nextDouble();                  //print it with 20 width space and round off to 4 decimal places.
        System.out.printf("%20.4f",dec);

        double Float = obj.nextDouble();                //print the floating point value according to the precision given.
        int precision = obj.nextInt();
        String format = "%."+precision+"f";
        System.out.printf(format,Float);

        double inputValue = obj.nextDouble();           //floating point value to its nearest integer value
        long input = Math.round(inputValue);
        System.out.println(input);

        String hex = obj.next();                         // hexadecimal value to decimal value
        long decimalValue = Long.parseLong(hex.substring(2), 16);
        System.out.println(decimalValue);

        float expo = obj.nextFloat();                    //float value to its exponential form
        System.out.printf("%e", expo);

        int value = obj.nextInt();                      //decimal to hexadecimal number
        String hexValue = Integer.toHexString(value);
        System.out.println(hexValue);

        double floatVal = obj.nextDouble();             //remove trailing zeros.
        String floatStr = Double.toString(floatVal);
        String formattedVal = floatStr;
        System.out.println(floatStr);
    }
}