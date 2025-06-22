public class Continue{
    public static void main(String[] args){
        for(int i=0;i<=5;i++){                  //continue in for loop
            if(i==3) continue;
            System.out.print(i+" ");
        }

        System.out.println();

        int c = 0;                              //continue in while loop
        while(c<=5){
            if(c==3){
                c++;
                continue;
            } 
            System.out.print(c+" ");
            c++;
        }

        System.out.println();
 
        for(int x=1;x<=4;x++){                   //continue in nested loop
            for(int y=1;y<=4;y++){
                if(x==3 && y==2) continue;
                System.out.print(x+"."+y+" ");
            }
            System.out.println();
        }
    }
}