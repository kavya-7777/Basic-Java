public class RightAligned{
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
    }
}