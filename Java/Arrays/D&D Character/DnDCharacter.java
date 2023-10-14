import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }


    int ability(List<Integer> scores) { 
        List<Integer> mutableList = new ArrayList<>(scores);
        Collections.sort(mutableList, Collections.reverseOrder());
        int ability = mutableList.stream().limit(3).mapToInt(Integer::intValue).sum();

        return ability;
    }

    List<Integer> rollDice() {
        List<Integer> roll = new ArrayList<>();
        roll.add((int) (Math.random() * 6 + 1));
        roll.add((int) (Math.random() * 6 + 1));
        roll.add((int) (Math.random() * 6 + 1));
        roll.add((int) (Math.random() * 6 + 1));

        return roll;    
    }

    int modifier(int input) {
        return (int) Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}

class test {
    public static void main(String[] args) {
        DnDCharacter dndCharacter = new DnDCharacter();
        //System.out.println(dndCharacter.rollDice());
        //System.out.println(dndCharacter.getStrength());
        //System.out.println(dndCharacter.modifier(5));
        System.out.println(dndCharacter.ability(List.of(4, 3, 2, 1)));
    }
}