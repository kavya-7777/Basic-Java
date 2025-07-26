public class ConcentricSquare{
    public static void main(String[] args){
        int n = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int min = Math.min(Math.min(i,j),Math.min(n-1-i,n-1-j));
                System.out.print((char)(65 + min) + " ");
            }
            System.out.println();
        }
    }
}