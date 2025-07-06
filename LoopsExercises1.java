import java.util.Scanner;

public class LoopsExercises1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();                         //perfect square or not
        boolean isSquare=false;
        for(int i=1;i*i<=N;i++){
            if(i*i==N){
                isSquare=true;
            }
        }
        if(isSquare) System.out.println("Perfect Square");
        else System.out.println("Not Perfect Square");

        long num = scanner.nextLong();                         //perfect cube or not
        boolean isCube=false;
        for(int i=1;i*i*i<=num;i++){
            if(i*i*i==num){
                isCube=true;
            }
        }
        if(isCube) System.out.println("Perfect cube");         
        else System.out.println("Not Perfect cube");

        int n = scanner.nextInt();                            //minimum number to be divided to 
        for(int i=1;i<=n;i++){                                 //make the number as a perfect square.
            if(n%i==0){
                int dividend = n/i;
                int sqrt = (int)Math.sqrt(dividend);
                if(sqrt*sqrt==dividend){
                    System.out.println(i);
                    break;
                }
            }
        }

        long base = scanner.nextLong();                      //pow() function.
        long pow = scanner.nextLong();
        long res = 1;
        for(int i=1;i<=pow;i++){
            res = res*base;
        }
        System.out.println(res);

        long divident = scanner.nextLong();                    //find quotient and remainder without / and %
        long divisor = scanner.nextLong();
        int quotient=0;
        while(divident>=divisor){
            divident-=divisor;
            quotient++;
        }
        System.out.println(quotient);
        System.out.println(divident);

        long n1 = scanner.nextLong();                          //multiply without *
        long n2 = scanner.nextLong();
        int result = 0;
        for(int i=1;i<=n2;i++){
            result+=n1;
        }
        System.out.println(result);

        int Num = scanner.nextInt();                           //Triangular number or not
        int x=1,sum=0;
        boolean isTriangular=false;
        while(sum<=Num){
            sum+=x;
            if(sum==Num){
                isTriangular=true;
                break;
            }
            x++;
        }
        if(isTriangular) System.out.println("Triangular Number");
        else System.out.println("Not a Triangular Number");

        int times = scanner.nextInt();                         //Print alphabets from a to z for given N times.
        for(int i=0;i<times;i++){
            for(char j='a';j<='z';j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        int inp = scanner.nextInt();                              //first N terms of fibonacci series.
        int a=0,b=1,c;
        for(int i=0;i<inp;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

        int input = scanner.nextInt();                           //print the values from 1 to n except multiples of 4
        for(int i=1;i<=input;i++){
            if(i%4==0) continue;
            System.out.print(i+" ");
        }
        
    }
}