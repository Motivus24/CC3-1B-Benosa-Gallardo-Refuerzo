package RPG;
/**
 *
 * @author 
*/
public class Character {

    static Dice dice = new Dice();

    public String name;
    public int strength,dexterity,intelligence,maxlife,currentlife;

   public Character(String n, int s, int d,int i){

       name = n;

       strength = s;

       dexterity = d;

       intelligence = i;

       maxlife= dice.roll();

       currentlife = maxlife;
   }
   public int attack(){

        return (dice.roll()) + strength;

   }

   public void wound(int damage){

       this.currentlife = this.currentlife - damage;
   }
   public void heal(int Healing){
  
    if(this.currentlife<this.maxlife) {

           currentlife+=Healing;
       }  
   }
   public String getName(){

       return name;
   }
    
   public int getStrength(){

       return strength;
   }
     public int getDexterity(){

       return dexterity;

   }

   public int getIntelligence(){

       return intelligence;
   }
   public int getCurrentLife(){

       return currentlife;

   }
   public int getMaxLife(){

       return maxlife;

   }

}
