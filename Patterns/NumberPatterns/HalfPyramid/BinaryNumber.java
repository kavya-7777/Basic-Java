public class BinaryNumber{
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1;i<=n;i++){
            int start = i % 2;
            for(int j=1;j<=i;j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}