import java.util.Scanner;

class User{
    public static void main(String[] args){
        System.out.println("hello");
        System.out.print(23);
        System.out.printf("%d",4);
        System.out.println();
        
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.print("Number = "+num);
    }
}