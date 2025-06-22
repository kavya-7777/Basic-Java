public class NestedDoWhile{
    public static void main(String[] args){
        int i =1;
        do{
            int j =1;
            do{
                System.out.print("("+i+","+j+") ");
                j++;
            }while(j<=3);
            System.out.println();
            i++;
        }while(i<=3);
    }
}