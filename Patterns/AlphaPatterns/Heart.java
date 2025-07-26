public class Heart{
    public static void main(String[] args){
        int n = 5;
        for(int i=n/2;i<=n;i+=2){
            for(int j=1;j<n-i;j+=2){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('A' + " ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('A' + " ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print('A' + " ");
            }
            System.out.println();
        }
    }
}

//ystem.out.print((j == 1 || j == i) ? "A " : "  ");
//System.out.print((j == 1 || j == 2 * i - 1) ? "A " : "  ");
//For Hollow Heart