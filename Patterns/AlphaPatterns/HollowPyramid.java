public class HollowPyramid{
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                if(j==0 || i==n || j==2*i-2)
                    System.out.print((char)(65 + j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}