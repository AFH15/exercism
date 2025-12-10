import java.util.*;

class DnDCharacter {
    
    // Store stats as fields so they are calculated only once
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private Random random = new Random();

    public DnDCharacter() {
        // Initialize stats in the constructor
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        // Create a copy of the list to satisfy "testAbilityCalculationDoesNotChangeInputScores"
        List<Integer> copy = new ArrayList<>(scores);
        Collections.sort(copy, Collections.reverseOrder());
        return copy.get(0) + copy.get(1) + copy.get(2);
    }

    List<Integer> rollDice() {
        List<Integer> randomNums = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            randomNums.add(random.nextInt(6) + 1);
        }
        return randomNums;
    }

    int modifier(int input) {
        // Use 2.0 to force floating point division for correct rounding
        // Use the 'input' parameter, not getConstitution()
        double temp = (input - 10) / 2.0;
        return (int) Math.floor(temp);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        // HP is 10 + modifier, not 10 + score
        return 10 + modifier(this.constitution);
    }
}