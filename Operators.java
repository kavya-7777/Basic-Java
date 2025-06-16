class Operators{
    public static void main(String[] args){
        int a=5, b=5;

        //Arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        //To convert String to integers
        String strnum1 = "45";
        String strnum2 = "45";
        int num1 = Integer.parseInt(strnum1);
        int num2 = Integer.parseInt(strnum2);
        System.out.println(num1+num2);

        //Unary operators
        System.out.println(+1);
        System.out.println(-1);
        System.out.println(!false);

        int x=10, y=10;
        System.out.println("post increment = " + x++);
        System.out.println("pre increment = " + ++y);
        
        //Assignment operator
        int s = 10;

        //Relational operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);

        //Logical operators
        System.out.println(a>b && a!=b);
        System.out.println(a<b || a==b);
        //System.out.println(!a);

        //Ternary operator (max of 3 nums)
        int p=20, q=10, r=30;
        int result = (p>q) ? ( p>r ? p : r) : (q>r ? q : r);
        System.out.println(r);

        //Bitwise operators
        int e = 0b1010;
        int f = 0b1100;
        System.out.println(e&f);
        System.out.println(e|f);
        System.out.println(e^f);
        System.out.println(~e);

        //To binary string
        String andResult = Integer.toBinaryString(e&f);
        System.out.println(andResult);

        //Shift operators
        a = 10;
        System.out.println(a<<1);  //multiplies by 2
        System.out.println(a>>1);  //divides by 2
        System.out.println(a>>>1); 

        //instanceof operator
        Example obj = new Example();
        System.out.println(obj instanceof Example);

        //Operator precedence
        a=20;
        b=10;
        int c=0;
        int d=20;
        e=40;
        f=30;
        System.out.println(a+b/10);
        System.out.println(a+b*d-e/f);
        System.out.println(a+++b);
    }
}

class Example{}