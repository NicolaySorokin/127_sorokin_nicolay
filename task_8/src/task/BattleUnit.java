package task;
//  Боец в компьютерной игре
public interface BattleUnit {
    String name();
    int health();
    int maxHealth();
    int maxArmor();
    void setMaxArmor(int value);
    void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
    void attack(BattleUnit other);
    void setMaxHealth(int value);
    void heal(int value);
    default void takeDamage(int value) {
        this.heal(-value);
    }
    int strength();
    void setStrength(int value);
    int baseStrength();
    int armor();
    void restoreArmor(int value);
    default void damageArmor(int value) {
        this.restoreArmor(-value);
    }
}
