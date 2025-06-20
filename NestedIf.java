class NestedIf{
    public static void main(String[] args){
        int age = 25;
        float weight = 65.5f;

        if(age>=18){
            if(weight>=50.0) System.out.println("you are eligible to donate blood.");
            else System.out.println("You must weight atleast 50kg to donate blood.");
        }
        else{
            System.out.println("You must be atleast  18 years old to donate blood.");
        }
    }
}