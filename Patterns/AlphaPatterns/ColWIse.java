public class ColWise{
    public static void main(String[] args){
        int n = 5;
        char ch = 'A';

        char[][] mat = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[j][i] = (ch++);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}