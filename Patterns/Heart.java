/*
public class Heart{
    public static void main(String[] args){
        int n = 3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2*n;i>0;i--){
            for(int k=1;k<=2*n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/

public class Heart {
    public static void main(String[] args) {
        int n = 6;
        for (int i=n/2;i<=n;i+=2) {
            for (int j=1;j<n-i;j+=2) {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for (int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--) {
            for (int j=0;j<n-i;j++) {
                System.out.print("  ");
            }
            for (int j=1;j<=(i*2)-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
