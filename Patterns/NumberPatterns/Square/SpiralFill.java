public class SpiralFill{
    public static  void main(String[] args){
        int n = 5;
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                mat[top][i] = num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                mat[i][right] = num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                mat[bottom][i] = num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                mat[i][left] = num++;
            }
            left++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%-3d",mat[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n-1;i>=0;i--){                             //Different rotation
            for(int j=n-1;j>=0;j--){
                System.out.printf("%-3d",mat[i][j]);
            }
            System.out.println();
        }
    }
}