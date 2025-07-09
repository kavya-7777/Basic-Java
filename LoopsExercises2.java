import java.util.Scanner;

public class LoopsExercises2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long input = scanner.nextLong();                  //print consecutive natural numbers from 1 to given input.
        for(int i=1;i<=input;i++){
            System.out.print(i+" ");
        }

        long nlimit = scanner.nextLong();                 //multiplication table
        long multiplicand = scanner.nextLong();
        for (long i = 1; i <= nlimit; i++) 
         {
            System.out.printf("%d * %d = %d\n", i, multiplicand, i * multiplicand);
         } 

        long val = scanner.nextLong();                     //Factorial of a number.
        long fact=1;
        for(int i=1;i<=val;i++){
          fact=fact*i;
        }        
        System.out.println(fact);
  
        long st = scanner.nextLong();                        //sum of even numbers
        long ends = scanner.nextLong();
        long sum=0;
        if(st%2!=0) st+=1;
        for(long i=st;i<=ends;i+=2){
          sum+=i;
        }
        System.out.print(sum);
     
        long start = scanner.nextLong();                     //print all Evennumber for the given start and end
        long end = scanner.nextLong();
        long itr;
        if (start % 2 == 0) itr = start;
        else itr = start + 1;
        while (itr <= end) 
        {
            System.out.print(itr + " ");
            itr += 2;
        }

    }
}