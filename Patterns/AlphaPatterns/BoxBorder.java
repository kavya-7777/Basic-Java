public class BoxBorder{
    public static void main(String[] args){
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-1 || i==0 || j==0 || j==n-1)
                    System.out.print((char)(65 + j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}