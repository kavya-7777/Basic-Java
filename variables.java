public class Variables{
    public static String staticVar = "Sweta";
        
    public String instVar;
    public int inst;

    public Variables(){
        this.instVar = "Kavya";
    }

    public static void main(String[] args){
        int localVar = 10;
        String localMessage = "This is a local variable";
        System.out.println("local var = "+localVar);
        System.out.println(localMessage);

        Variables instObj = new Variables();
        System.out.println("Instance variable = "+instObj.instVar);
        System.out.println("Default value of instance var, inst = "+instObj.inst);

        System.out.println("static variable = "+Variables.staticVar);
    }    
}