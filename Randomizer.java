import java.util.Random;

/**
 * Create a single object to generate random numbers needed throughout program
 *
 * @author Sam Thornton
 * @version 12.1.2017
 */
public class Randomizer
{
    private static Random rand;

    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        rand = new Random();
    }

    /**
     * Create a random object to be called and passed arguments for boundries
     * @param y A value to represent boundries of the random number
     */
    public static int nextInt(int y)
    {
        if (rand == null) {
            rand = new Random();
        }
    
        return rand.nextInt(y);
    }
}
