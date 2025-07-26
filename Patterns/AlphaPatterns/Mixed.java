public class Mixed{
    public static void main(String[] args){
        int n = 5, num = 1;
        char ch = 'A';
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.printf("%d%c ",(num++),(ch++));
            }
            System.out.println();
        }
    }
}