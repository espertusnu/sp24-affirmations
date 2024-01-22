import com.google.common.annotations.VisibleForTesting;

import java.util.List;
import java.util.Random;

public class AffirmationGenerator {
    @VisibleForTesting
    public static final List<String> AFFIRMATIONS = List.of(
            "I have improved my programming ability over time.",
            "If I improve 1% a day, my abilities will double in 70 days.",
            "Every challenge I face is an opportunity to learn and grow.",
            "It's normal to struggle sometimes.",
            "I know more than I did last week, and I'll know even more next week.",
            "We do things not because they are easy but because they are hard."
    );

    // instance variable
    private Random random;  // random number generator, initialized in constructor

    /**
     * Creates an affirmation generator.
     */
    public AffirmationGenerator() {
        random = new Random();
    }


    /**
     * Creates an affirmation generator with the specified seed.
     *
     * @param seed the seed
     */
    public AffirmationGenerator(long seed) {
        random = new Random(seed);
    }

    /**
     * Returns an affirmation.
     *
     * @return an affirmation
     */
    public String getAffirmation() {
        int index = random.nextInt(AFFIRMATIONS.size());
        return AFFIRMATIONS.get(index);
    }

    public static void main(String[] args) {
        AffirmationGenerator generator = new AffirmationGenerator();
        System.out.println(generator.getAffirmation());
    }
}
