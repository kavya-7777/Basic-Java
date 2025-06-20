class NestedSwitch{
    public static void main(String[] args){
        String Branch = "CSE";
        int year = 2;

        switch(year){
            case 1:
                System.out.println("Elective courses : Advanced English, Algebra");
                break;
            case 2:
                switch(Branch){
                    case "CSE":
                    case "CSD":
                        System.out.println("Elective course : Big Data, Machine Learning");
                        break;
                    case "ECE":
                        System.out.println("Elective course : Antenna Engineering");
                        break;
                    default:
                        System.out.println("Elective course : Optimization");
                }
                break;
            default:
                System.out.println("No electives for 3rd and 4th year");
        }
    }
}