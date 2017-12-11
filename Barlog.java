/**
 * Stronger subclass of Demon.
 *
 * @author Sam Thornton
 * @version 12.01.2017
 */
public class Barlog extends Demon
{
    private static final int MAX_BARLOG_HP = 200;
    private static final int MIN_BARLOG_HP = 80;
    private static final int MAX_BARLOG_STR = 100;
    private static final int MIN_BARLOG_STR = 50;

    /**
     * Constructor for objects of class Barlog
     */
    public Barlog()
    {
        super(
        Randomizer.nextInt(MAX_BARLOG_HP - MIN_BARLOG_HP) + MIN_BARLOG_HP,
        Randomizer.nextInt(MAX_BARLOG_STR-MIN_BARLOG_STR) + MIN_BARLOG_STR
        );
    }

    /**
     * 
     * Call Demons's damage method to allow a Barlog to deal a second attack.
     * @return dmg total damage
     */

    public int damage()
    {
        int dmg;
        dmg = super.damage() + super.damage();
        return dmg;
    }
}