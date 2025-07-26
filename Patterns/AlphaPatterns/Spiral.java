public class Spiral{
    public static void main(String[] args){
        int n = 5;
        int ch = 65;

        int[][] mat = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                mat[top][j] = ch++;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                mat[j][right] = ch++;
            }
            right--;
            for(int j=right;j>=left;j--){
                mat[bottom][j] = ch++;
            }
            bottom--;
            for(int j=bottom;j>=top;j--){
                mat[j][left] = ch++;
            }
            left++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(mat[i][j]) + " ");
            }
            System.out.println();
        }
    }
}