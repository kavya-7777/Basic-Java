public class Square{
    public static void main(String[] args){
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(65 + i) + " ");
            }
            System.out.println();
        }
    }
}