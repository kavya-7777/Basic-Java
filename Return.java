public class Return{
    int add(int x, int y){                  //returns a value
        int result = x+y;
        return result;
    }

    void demoCheck(int n){                 //do not return a value
        if(n<9) n++;
        return;
    }

    public static void main(String[] args){
        System.out.println(new Return().add(5,6));
        new Return().demoCheck(5);
    }
}