public class ContinuousSquare{
    public static void main(String[] args){
        int n = 5, val = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(64 + (val++)) + " ");
            }
            System.out.println();
        }
    }
}