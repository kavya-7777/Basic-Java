public class Diamond{
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
    }
}