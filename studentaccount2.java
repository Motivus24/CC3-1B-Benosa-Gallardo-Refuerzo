package studentaccount2;

public class studentaccount2 {

    public static void main(String[] args) {
        
        System.out.println("**************************************************************");
        studentinfo stud1 = new studentinfo();
        stud1.setIdNum("18-1684-361");
        stud1.setFirstName("James Vincent ");
        stud1.setLastName("Benosa");
        stud1.setAcadProg("BSIT - ERP ");
        
        System.out.println(stud1.print());
        System.out.println("\n***********************************************************");
        System.out.println("\nName: "+stud1.getLastName()+", "+stud1.getFirstName());
        System.out.println("ID Number: "+stud1.getIdNum());
        System.out.println("Academic Program: "+stud1.getAcadProg());
        System.out.println("Instructor: Mr. Jan Warren Sim Padua");
        
        System.out.println(stud1.getIdNum());
        
        
    }
    
}