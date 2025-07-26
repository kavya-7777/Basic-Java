public class FullAlphabet{
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i-1;j++){
                System.out.print((char)(65 + j) + " ");
            }
            for(int j=i-1;j>=0;j--){
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();

        }
    }
}