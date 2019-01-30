package studentaccount2;


public class studentinfo {
    
    String university;
    String college;
    String term;
    
    private String IdNum;
    private String lastName;
    private String firstName;
    private String acadProg;
    private String track;
    
    studentinfo(){
        
    this.university="\t\tUniversity of the Cordilleras";
    this.college="  College of Information Technology and Computer Science";
    this.term="\t\t\t  CITCS - 1B  \n\t\t      2nd Term 2018-2019";
    
    
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getIdNum() {
        return IdNum;
    }

    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAcadProg() {
        return acadProg;
    }

    public void setAcadProg(String acadProg) {
        this.acadProg = acadProg;
    }
    public String print(){
        
        System.out.println("");
        return this.university+"\n"+this.college+"\n"+ this.term;
    
    }
    
}