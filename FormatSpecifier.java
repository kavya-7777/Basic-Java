public class FormatSpecifier{
    public static void main(String[] args){

        //Integer Formats
        System.out.printf("%d \n", 42);             //Decimal integer      
        System.out.printf("%5d \n", 42);            //Right-align in width 5
        System.out.printf("%-5d! \n", 42);            //Left-align in width 5
        System.out.printf("%+5d \n", 42);            //Show sign, right-align
        System.out.printf("%+-5d \n", 42);           //Show sign, left-align
        System.out.printf("%05d \n", 42);            //Pad with zeros to width 5

        //2. Float Formats
        System.out.printf("%f \n", 3.14);            //Default 6 decimal places
        System.out.printf("%.2f \n", 3.14);          //2 decimal places
        System.out.printf("%8.2f \n", 3.14);         //Width 8, 2 decimals, right-align
        System.out.printf("%-8.2f \n", 3.14);        //Width 8, 2 decimals, left-align
        System.out.printf("%+8.2f \n", 3.14);        //Show sign, right-align
        System.out.printf("%08.2f \n", 3.14);        //Pad with zeros

        //String Formats
        System.out.printf("%s \n", "Hi");            //Print string
        System.out.printf("%10s \n", "Hi");          //Right-align in 10-char field
        System.out.printf("%-10s \n", "Hi");         //Left-align in 10-char field
        System.out.printf("%-10s! \n", "name");      //left-aligned

        //Character Format
        System.out.printf("%c \n", 'A');             //Single character
    }
}