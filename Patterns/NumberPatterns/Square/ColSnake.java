public class ColSnake{
    public static  void main(String[] args){
        int n = 5;
        int mat[][] = new int[n][n];
        int num = 1;

        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                for(int j=0;j<n;j++){
                    mat[j][i] = num++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    mat[j][i] = num++;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%-3d",mat[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n-1;i>=0;i--){                                       //Reverse order
            for(int j=n-1;j>=0;j--){
                System.out.printf("%-3d",mat[i][j]);
            }
            System.out.println();
        }
    }
}