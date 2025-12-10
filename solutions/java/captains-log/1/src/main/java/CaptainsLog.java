import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int randomInt = random.nextInt(10);
        return PLANET_CLASSES[randomInt];
    }

    String randomShipRegistryNumber() {
        int randomInt = random.nextInt(9000) + 1000;
        return "NCC-" + randomInt;
    }

    double randomStardate() {
        double randomDouble = random.nextDouble() * 1000 + 41000;
        return randomDouble;
    }
}
