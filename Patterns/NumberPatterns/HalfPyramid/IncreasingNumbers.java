public class IncreasingNumbers{
    public static void main(String[] args){
        int n = 5;

        for(int i=1;i<=n;i++){                   //Left-Aligned
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n;i>=1;i--){                   //Inverted Left-Aligned
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();        
        
        for(int i=1;i<=n;i++){                   //Right-Aligned
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }                  
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();        
        
        for(int i=n;i>=1;i--){                   //Inverted Right-Aligned
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }                  
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
