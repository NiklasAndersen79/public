package niklas.LEB.randomgenerator;

import java.util.Random;

/**
 * Generates a random int between zero and two
 */

public class RandomGenerator {

    private final Random random = new Random(System.currentTimeMillis());

    public int getRandomNumber() {
        return random.nextInt(3);
    }

}
