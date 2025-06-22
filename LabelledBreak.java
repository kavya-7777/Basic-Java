public class LabelledBreak{
    public static void main(String[] args){
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Before break statement.");
                    if(t) break second;
                }
                System.out.println("Thi won't execute.");
            }
            System.out.println("It's inside first, after second break.");
        }
    }
}