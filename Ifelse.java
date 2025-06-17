import java.util.Scanner;

class Ifelse{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        
        if(age>18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        
    }
}