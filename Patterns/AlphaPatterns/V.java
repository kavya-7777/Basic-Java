public class V{
    public static void main(String[] args){
        int n = 5;
        char ch = 'A';

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    System.out.print((char)(ch + j) + " ");
                else
                    System.out.print("  ");
            }
            for(int j=n-2;j>=0;j--){
                if(i==j)
                    System.out.print((char)(ch + j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}