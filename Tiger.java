import java.util.Random;

public class Tiger extends Animal{

    // The age at which a tiger can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a tiger can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a tiger breeding.
    private static final double BREEDING_PROBABILITY = 0.12;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();

    public Tiger(Field field, Location location){
        super(field, location);
    }
    

}
