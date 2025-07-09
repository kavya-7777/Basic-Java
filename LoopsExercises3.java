import java.util.Scanner;

public class LoopsExercises3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();                                 //number of trailing zeros in the factorial of the given number.
        long count=0;
        while(num > 0){
            count += num/5;
            num/=5;
        }
        System.out.println(count);

        long n = scanner.nextLong();                                  //series of N values that has 2 and 3 powers alternatively.
        long powerOf2=1,powerOf3=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(powerOf2+" ");
                powerOf2 *= 2;
            }else{
                System.out.print(powerOf3+" ");
                powerOf3 *= 3;
            }
        }

        long N = scanner.nextLong();                                    //N values of a series
        long oddTerm=2;                                                 //where the odd terms are multiples of 2
        for(int i=1;i<=N;i++){                                          //even terms are obtained by dividing previous term by 2
            if(i%2!=0){
                System.out.print(oddTerm+" ");
            }else{
                System.out.print(oddTerm/2+" ");
                oddTerm+=2;
            }
        }

        int x = scanner.nextInt();                                        //check whether a number is Pentagonal number
        double res = (1 + Math.sqrt(1+24*x)) / 6;
        if(res == (int)res) System.out.println("Pentagonal Number");
        else System.out.println("Not a Pentagonal Number");

        int Num = scanner.nextInt();
        int power = 1;
        Num = Num-1;
        while(Num%2==0){
            Num = Num/2;
            power = power*2;
        }
        if(Num < power) System.out.println("Proth Number");
        else System.out.println("Not  Proth Number");

    }
}