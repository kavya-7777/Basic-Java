public class ReversedAlphabet{
    public static void main(String[] args){
        int n = 5;
        for(int i=n;i>0;i--){
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

/*
public class ReversedAlphabet{
    public static void main(String[] args){
        int n = 5;
        for(int i=n;i>0;i--){
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
*/