public class ForEach{
    public static void main(String[] args){
        int array[] = {1,2,3,4,5};
        for(int element : array){
            element*=2;
            System.out.print(element+" ");
        }
        
        System.out.println();
        
        for(int element : array){
            System.out.print(element+" ");
        }
    }
}