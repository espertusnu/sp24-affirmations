import java.util.List;
import java.util.Random;

public class Affirmations {
    private static final List<String> AFFIRMATIONS = List.of(
            "I have improved my programming ability over time.",
            "If I improve 1% a day, my abilities will double in 70 days.",
            "Every challenge I face is an opportunity to learn and grow.",
            "It's normal to struggle sometimes.",
            "I know more than I did last week, and I'll know even more next week.",
            "We do things not because they are easy but because they are hard."
    );

    /**
     * Returns a positive affirmation.
     *
     * @return a positive affirmation
     */
    public static String getAffirmation() {
        Random random = new Random();
        int index = random.nextInt(AFFIRMATIONS.size() + 1);
        return AFFIRMATIONS.get(index);
    }

    public static void main(String[] args) {
        System.out.println(Affirmations.getAffirmation());
    }
}
