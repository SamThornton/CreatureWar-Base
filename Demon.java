import java.util.Random;

/**
 * Demonic subclass of creature.
 * 
 * @author Sam Thornton 
 * @version 12.01.2017
 */
public class Demon extends Creature
{
    
    private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 10;
    private static final int MAX_DEMON_STR = 18;
    private static final int MIN_DEMON_STR = 5;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
          
    }
    
    /**
     * Constructor for Demon subclasses
     */
    public Demon(int hp, int str)
    {
        super(hp, str);
    }
    
    /**.
     * 5% chance to do magical (doubled) damage
     * @return dmg
     */
    public int damage()
    {
        int dmg;
        dmg = super.damage();
        
        if(Randomizer.nextInt(100)+1 <= 5){
            dmg += 50;
        }
        return dmg;
    }

}
