public class HollowNumber{
    public static void main(String[] args){
        int n = 7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || i==j || i==n)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}