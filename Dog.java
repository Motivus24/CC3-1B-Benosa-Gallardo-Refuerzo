package classesandobjects1;


public class Dog {
    
    String name;
    int age;
    String breed;
    char gender;
    
    public void setName(String dogName){
        name=dogName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int dogAge){
        age=dogAge;
    }
    public int getAge(){
        return age;
    }
     public void setbreed(String dogbreed)
    {
        breed = dogbreed;
    }
    public String getBreed(){
        return breed;
    }
    public void setGender(char dogGender){
        gender=dogGender;
    }
    public Character getGender(){
        return gender;
    }
}

