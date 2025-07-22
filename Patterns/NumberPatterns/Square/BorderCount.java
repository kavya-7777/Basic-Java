public class BorderCount{
    public static void main(String[] args){
        int n = 5, num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int min = Math.min(Math.min(i,j), Math.min(n-1-i,n-1-j));
                System.out.print(min+1 + " ");
            }
            System.out.println();
        }
    }
}

/*
public class BorderCount{                                                           // Same pattern Triangle
    public static void main(String[] args){
        int n = 5, num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int min = Math.min(Math.min(i,j), Math.min(n-1-i,n-1-j));
                System.out.print(min+1 + " ");
            }
            
            System.out.println();
        }
    }
}
*/