import java.util.List;
import java.util.Random;

public class AffirmationGenerator {
    private static final List<String> AFFIRMATIONS = List.of(
            "I have improved my programming ability over time.",
            "If I improve 1% a day, my abilities will double in 70 days.",
            "Every challenge I face is an opportunity to learn and grow.",
            "It's normal to struggle sometimes.",
            "I know more than I did last week, and I'll know even more next week.",
            "We do things not because they are easy but because they are hard."
    );

    /**
     * Creates an affirmation generator.
     */
    public AffirmationGenerator() {}

    /**
     * Returns an affirmation.
     *
     * @return an affirmation
     */
    public String getAffirmation() {
        Random random = new Random();
        int index = random.nextInt(AFFIRMATIONS.size() + 1);
        return AFFIRMATIONS.get(index);
    }

    public static void main(String[] args) {
        AffirmationGenerator generator = new AffirmationGenerator();
        System.out.println(generator.getAffirmation());
    }
}
