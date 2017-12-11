import java.util.Random;
import java.util.ArrayList;

/**
 * Where the battle happens
 * 
 * @author Sam Thornton
 * @version 12.1.2017
 */
public class War
{
    public Random rand = new Random();
    private ArrayList<Creature> firstSide;
    private ArrayList<Creature> secondSide;
    int battleSpots = rand.nextInt(8);
    
    public War(){
        firstSide = new ArrayList<Creature>(4);
        secondSide = new ArrayList<Creature>(4);
    }
    
    private Creature addSpots(){ // # of creatures added to list.
       Random rand = new Random(); 
       int creature = rand.nextInt(4);
       if (creature == 0) {
           return new Demon();
       }
       if (creature == 1) {
           return new Elf();
       }
       if (creature == 2) {
           return new Barlog();
       }
       if (creature == 3) {
           return new Human();
       }
       else {
       return new CyberDemon();
       }
    }
    
    public void createSides(){
       for (int Side = 0; Side < battleSpots; Side++) {
             firstSide.add(addSpots());
             secondSide.add(addSpots());
         }
    }
    
    public void newbattle()
    {
        if (firstSide.isEmpty()) {
         System.out.println("Please populate sides before going to war.");
         return;
        }
        else {
        int Side1 = 0;
        int Side2 = 0;
        while (Side1 < battleSpots && Side2 < battleSpots)
        {
            firstSide.get(Side1).takeDamage(secondSide.get(Side2).attack());
            secondSide.get(Side2).takeDamage(firstSide.get(Side1).attack());
             if (firstSide.get(Side1).isAlive() != true){
                 Side1++;
             }
             if (secondSide.get(Side2).isAlive() != true){
                 Side2++;
             }      
        }
            
        if (Side1 < Side2) {
             System.out.println("Side two wins the battle!");
        }
        else if (Side1 > Side2) {
             System.out.println("Side one wins the battle!");
        }          
        else {
            System.out.println("All creatures have died. There are no winners.");
        }
        }
    }    
}
