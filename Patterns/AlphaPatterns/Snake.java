//Row Snake
public class Snake{
    public static void main(String[] args){
        int n = 5;
        char ch = 'A';

        char[][] mat = new char[n][n];

        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                for(int j=0;j<n;j++){
                    mat[i][j] = (ch++);
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    mat[i][j] = (ch++);
                }
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

/*
//Column Snake
public class Snake{
    public static void main(String[] args){
        int n = 5;

        char[][] mat = new char[n][n];
        char ch = 'A';
            
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                for(int j=0;j<n;j++){
                    mat[j][i] = (ch++);
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    mat[j][i] = (ch++);
                }
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
*/