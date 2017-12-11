import java.util.Random;

/**
 * The creature is the main class from which all other battling creatures.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or dead. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Sam Thornton 
 * @version 12.1.2017
 */
public abstract class Creature
{
   private int hp;
   private int str;
   private int max_hp;
   private Random rand = new Random();
   
   /**
    * Default constructor - this should never actually run
    */   
   public Creature(){
       str = 10;
       hp = 10;
       max_hp = hp;
   }
   
   /**
    * Create a creature with a given strength and hit point amount.
    * @param str the strength of the creature, used to calculate damage
    * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
    */
   public Creature (int str, int hp) 
   {
      this.str = str;
      this.hp = hp;
   }
   
   /**
    * Allows a creature to determine how much damage it is causing in this round of battle
    * @return a value between 1 and str to be used to cause damage to another creature
    */
   public int damage(){
       int dmg;
       dmg = rand.nextInt(str) + 1;
       return dmg;
   }
   
   /**
    * Is this creature still capable of fighting?
    * @return true when current hit point level is greater than zero
    */
   public boolean isAlive() 
   {
       boolean alive = false;
        if (hp > 0) {
           alive = true;
       }
       return alive;
   }
   
   /**
    * Is this creature deceased?
    * @return true when current hit point level is less than or equal to zero
    */
   public boolean isDead() 
   {
       boolean dead = false;
       if (hp <= 0) {
           dead = true;
       }

       return dead;
   }
   
   /**
    * takeDamage receives a value for the amount of damage to subtract from 
    * the current total of hit points
    * @param damage value to remove from hit point count
    */
   public void takeDamage(int damage) {
       hp = hp - damage;
   }
   
   /**
    * attacks cause 1- strength point(s) of damage
    * @return damage value cause by attack
    */
   public int attack() {
       return rand.nextInt(str) + 1;
   }
}
