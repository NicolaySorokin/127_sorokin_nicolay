package task;
// Обыкновенный пехотинец
public class Infantryman extends BattleUnitBase {
    public Infantryman(String HeroesName, int maxHealth, int baseStrength, int maxArmor) {
        super(HeroesName, maxHealth, baseStrength, maxArmor);
    }
    @Override
    public void attack(BattleUnit other) {
        if (other.armor()>0) {
            other.takeDamage(Math.max(this.strength()/2, 1) );
            other.damageArmor(Math.max(this.strength()/4, 1) );
        } else
            other.takeDamage(this.strength() );
    }
    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
    }
}
