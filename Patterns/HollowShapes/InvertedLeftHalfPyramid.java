public class InvertedLeftHalfPyramid{
    public static void main(String[] args){
        int n = 5;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==1 || j==1 || i==j || i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}