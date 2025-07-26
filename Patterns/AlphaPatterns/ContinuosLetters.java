public class ContinuosLetters{
    public static void main(String[] args){
        int n = 5, start = 0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(65 + (start++)) + " ");

            }
            System.out.println();
        }
    }
}