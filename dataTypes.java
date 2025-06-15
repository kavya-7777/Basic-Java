public class dataTypes{
    static public void main(String[] name){
        byte a = 123;
        short b = 12345;
        int c = 1234567890;
        long d = 1234567890123456789L;

        float e = 0.12345678f;
        double f = 0.12345678901234345;

        char g = 'A';

        boolean h = true;

        float i = 12e3f;
        double j = 34E5F;

        System.out.printf("%d %d %d %d %f %f %.14f %c %b %e %e \n",a,b,c,d,e,f,f,g,h,i,j);

        //widening casting (implicit-type casting)
        int myInt = 6;
        double myDouble = myInt;
        System.out.println(myDouble);

        //narrow casting (explicit-type casting)
        double myDoub = 45.67;
        int myIn = (int) myDoub;
        System.out.print(myIn);

    }
}