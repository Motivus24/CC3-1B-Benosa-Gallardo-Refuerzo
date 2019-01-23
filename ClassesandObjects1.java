package classesandobjects1;

import java.util.Scanner;

public class ClassesandObjects1 {

    
    public static void main(String[] args) {
       Scanner doginput=new Scanner(System.in);
       
       Dog bruno=new Dog();
       bruno.setName("Dog bruno");
       String dog1=bruno.getName(); 
       System.out.println(dog1);
       
        System.out.println("============================");
       System.out.println("Age: ");
       int age=doginput.nextInt();
       int dog2=bruno.getAge();
       bruno.setAge(age);
       
        System.out.println("============================");
       System.out.println("breed: ");
       String breed=doginput.nextLine();
       String dog3=doginput.nextLine();
       bruno.setbreed(breed);
       
        System.out.println("============================");
       System.out.println("Gender: ");
        
       
       char gender=doginput.next().charAt(0);
       Character dog4=doginput.next().charAt(0);
       bruno.setGender(gender);
     
    }
}
