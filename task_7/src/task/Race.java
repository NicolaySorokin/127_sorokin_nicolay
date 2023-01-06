package task;

public enum Race {
    Orc(6, 12, 2),
    Elf(2, 9, 9),
    Dwarf(6, 10, 4),
    Halfling(1, 8, 11),
    Human(6, 7, 7);
    private final int health;
    private final int agility;
    private final int strength;


    Race(int strength, int health, int agility) {
        this.strength = strength;
        this.health = health;
        this.agility = agility;
    }

    public int dexterity() {
        return this.agility;
    }
    public int strength() {
        return this.strength;
    }

    public int health() {
        return this.health;
    }
}
