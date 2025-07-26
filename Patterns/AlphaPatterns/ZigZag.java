public class ZigZag{
    public static void main(String[] args){
      int n = 3, alpha = 9;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=alpha;j++){
            if( ((i + j) % 4 == 0) || (i==2 && j % 4 ==0))
                System.out.print((char)(64 + j) + " ");
            else
                System.out.print("  ");
        }
        System.out.println();
      }
    }
}
