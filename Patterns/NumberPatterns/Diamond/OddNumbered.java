public class OddNumbered{
    public static void main(String[] args){
        int n = 3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int num = 1;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int num = 1;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}