public class PascalAlpha{
    public static void main(String[] args){
        int n = 5;
        for(int i=0;i<n;i++){
            int val = 1;
            for(int j=0;j<=i;j++){
                System.out.print((char)(64 + val) + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}