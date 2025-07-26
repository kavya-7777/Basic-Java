/*
public class ShiftedTriangle{
    public static void main(String[] args){
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print((char)(65 + (j + i - 1)) + " ");
            }
            System.out.println();
        }
    }
}
*/

public class ShiftedTriangle{
    public static void main(String[] args){
        int n = 5;
        for(int i=0;i<n;i++){
            char ch = (char)('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch + " ");
                ch ++;
            }
            System.out.println();
        }
    }
}