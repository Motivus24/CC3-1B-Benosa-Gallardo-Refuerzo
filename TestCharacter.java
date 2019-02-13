package RPG;

public class TestCharacter {

    public static void main(String[] args) {
    Character character1 = new Character("Ben",5,2,3);
    Character character2 = new Character("Ten",2,3,5);
    
        System.out.println("Round 1");
        
        System.out.println(character1.getName()+" : "+character1.getCurrentLife());
        System.out.println(character2.getName()+" : "+character2.getCurrentLife());
        
        int dmg1=character1.attack();
        character2.wound(dmg1);
        
        int dmg2=character2.attack();
        character2.wound(dmg2);
        
        System.out.println(character1.getName()+" Attacks " + character2.getName() + " for " + dmg1);
        System.out.println(character2.getName()+" Attacks " + character1.getName() + " for " + dmg2);
        
        System.out.println("Round 2");
        
        System.out.println(character1.getName()+" : "+character1.getCurrentLife());
        System.out.println(character2.getName()+" : "+character2.getCurrentLife());
        
         int dmg3=character1.attack();
        character2.wound(dmg3);
        
        int dmg4=character2.attack();
        character2.wound(dmg4);
        
        System.out.println(character1.getName()+" Attacks " + character2.getName() + " for " + dmg3);
        System.out.println(character2.getName()+" Attacks " + character1.getName() + " for " + dmg4);
        
        System.out.println("Round 3");
        
        System.out.println(character1.getName()+" : "+character1.getCurrentLife());
        System.out.println(character2.getName()+" : "+character2.getCurrentLife());
        
         int dmg5=character1.attack();
        character2.wound(dmg5);
        
        int dmg6=character2.attack();
        character2.wound(dmg6);
        
        System.out.println(character1.getName()+" Attacks " + character2.getName() + " for " + dmg5);
        System.out.println(character2.getName()+" Attacks " + character1.getName() + " for " + dmg6);
        
        if(character1.getCurrentLife()<character2.getCurrentLife()){
            System.out.println(character2.getName()+ " Wins! ");
        }else if(character1.getCurrentLife()>character2.getCurrentLife()){
            System.out.println(character1.getName() + " Wins! ");
        }else if(character1.getCurrentLife()==character2.getCurrentLife()){
            System.out.println( " Its a Draw! ");
       }
    }
    
}