public class Heart{
    public static void main(String[] args){
        int n = 10;
        for(int i=n/2;i<=n;i+=2){
            for(int j=1;j<=n-i-1;j+=2){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || i==j || i==n/2 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || i==j || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}