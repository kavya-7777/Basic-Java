public class ColWiseFill{
    public static  void main(String[] args){
        int n = 5;
        int[][] mat = new int[n][n];
        int num = 1;

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                mat[col][row] = num++;
            }
        }

        for(int i=0;i<n;i++){                                         
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n-1;i>=0;i--){                                       //Reverse order
            for(int j=n-1;j>=0;j--){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}