package task;
// Алхимик, исцеляющий союзников и дебафающий врагов
public class Alchemist extends BattleUnitBase {
    public Alchemist(String HeroesName, int baseStrength, int maxArmor, int maxHealth) {
        super(HeroesName, baseStrength, maxArmor, maxHealth);
    }
    @Override
    public void attack(BattleUnit other) {
        other.setStrength(other.strength()-2);
        other.setMaxHealth(other.maxHealth()-4);
    }
    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int minHealth = Integer.MAX_VALUE, index1 = 0;
        int maxHealth = Integer.MIN_VALUE, index2 = 0;
        for (int i = 0; i<ownTeam.length; i++) {
            if (ownTeam[i].health()<=0) continue;
            final int teammateHealth = ownTeam[i].health();
            if (teammateHealth < minHealth) {
                minHealth = teammateHealth;
                index1 = i;
            }
            if (teammateHealth>maxHealth) {
                maxHealth = teammateHealth;
                index2 = i;
            }
        }
        final BattleUnit teammateLowHealth = ownTeam[index1];
        final BattleUnit teammateHighHealth = ownTeam[index2];
        teammateLowHealth.heal(10);
        teammateHighHealth.setStrength(teammateHighHealth.strength() + 1);
    }
}
