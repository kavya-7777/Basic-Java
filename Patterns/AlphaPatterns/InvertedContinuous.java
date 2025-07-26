public class InvertedContinuous{
    public static void main(String[] args){
        int n = 5, start = 0;
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65 + (start++)) + " ");
            }
            System.out.println();
        }
    }
}