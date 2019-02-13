package RPG;

public class TestCharacter {

    public static void main(String[] args) {
    Character Trinity = new Character("Trinity",5,2,3);
    Character Fleur = new Character("Fleur",2,3,5);
    
        System.out.println("Round 1");
        
        System.out.println(Trinity.getName()+" : "+Trinity.getCurrentLife());
        System.out.println(Fleur.getName()+" : "+Fleur.getCurrentLife());
        
        int dmg1=Trinity.attack();
        Fleur.wound(dmg1);
        
        int dmg2=Fleur.attack();
        Fleur.wound(dmg2);
        
        System.out.println(Trinity.getName()+" Attacks " + Fleur.getName() + " for " + dmg1);
        System.out.println(Fleur.getName()+" Attacks " + Trinity.getName() + " for " + dmg2);
        
        System.out.println("Round 2");
        
        System.out.println(Trinity.getName()+" : "+Trinity.getCurrentLife());
        System.out.println(Fleur.getName()+" : "+Fleur.getCurrentLife());
        
        int dmg3=Trinity.attack();
        Fleur.wound(dmg3);
        
        int dmg4=Fleur.attack();
        Fleur.wound(dmg4);
        
        System.out.println(Trinity.getName()+" Attacks " + Fleur.getName() + " for " + dmg3);
        System.out.println(Fleur.getName()+" Attacks " + Trinity.getName() + " for " + dmg4);
        
        System.out.println("Round 3");
        
        System.out.println(Trinity.getName()+" : "+Trinity.getCurrentLife());
        System.out.println(Fleur.getName()+" : "+Fleur.getCurrentLife());
        
        int dmg5=Trinity.attack();
        Fleur.wound(dmg5);
        
        int dmg6=Fleur.attack();
        Fleur.wound(dmg6);
        
        System.out.println(Trinity.getName()+" Attacks " + Fleur.getName() + " for " + dmg5);
        System.out.println(Fleur.getName()+" Attacks " + Trinity.getName() + " for " + dmg6);
        
        if(Trinity.getCurrentLife()<Fleur.getCurrentLife()){
            System.out.println(Fleur.getName()+ " Wins! ");
        }else if(Trinity.getCurrentLife()>Fleur.getCurrentLife()){
            System.out.println(Trinity.getName() + " Wins! ");
        }else if(Trinity.getCurrentLife()==Fleur.getCurrentLife()){
            System.out.println( " Its a Draw! ");
       }
    }
    
}