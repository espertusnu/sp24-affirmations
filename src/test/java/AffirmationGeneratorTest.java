import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AffirmationGeneratorTest {
    private static final int NUM_TRIALS = 100;
    private static final long SEED = 1L;

    private AffirmationGenerator generator;

    @BeforeEach
    public void setup() {
        generator = new AffirmationGenerator(SEED);
    }

    @Test
    public void getAffirmationReturnsAnAffirmation() {
        for (int i = 0; i < NUM_TRIALS; i++) {
            String affirmation = generator.getAffirmation();
            assertTrue(AffirmationGenerator.AFFIRMATIONS.contains(affirmation));
        }
    }
}