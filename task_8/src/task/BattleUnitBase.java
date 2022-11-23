package task;
// Базовая реализация бойца
public abstract class BattleUnitBase implements BattleUnit {
    protected int baseStrength, StrengTer;
    protected int maxHealth, currHealth;
    protected final String HeroesName;
    protected int maxArmor, ArmorSer;
    public BattleUnitBase(String HeroesName, int maxHealth, int baseStrength, int maxArmor) {
        this.HeroesName = HeroesName;
        this.currHealth = this.maxHealth = maxHealth;
        this.StrengTer = this.baseStrength = baseStrength;
        this.ArmorSer = this.maxArmor = maxArmor;
    }
    @Override
    public String name() {
        return this.HeroesName;
    }
    @Override
    public int health() {
        return this.currHealth;
    }
    @Override
    public int maxHealth() {
        return this.maxHealth;
    }
    @Override
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        this.currHealth = Math.min(this.currHealth, this.maxHealth);
    }
    @Override
    public void heal(int value) {
        this.currHealth = Math.max(Math.min(this.health() + value, this.maxHealth() ), 0);
    }
    @Override
    public int strength() {
        return this.StrengTer;
    }
    @Override
    public void setStrength(int value) {
        this.StrengTer = value;
    }
    @Override
    public int baseStrength() {
        return this.baseStrength;
    }
    @Override
    public int armor() {
        return this.ArmorSer;
    }
    @Override
    public void restoreArmor(int value) {
        this.ArmorSer = Math.max(Math.min(this.armor() + value, this.maxArmor() ), 0);
    }
    @Override
    public int maxArmor() {
        return this.maxArmor;
    }
    @Override
    public void setMaxArmor(int value) {
        this.maxArmor = value;
        this.ArmorSer = Math.min(this.ArmorSer, this.maxArmor);
    }
    @Override
    public abstract void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
    @Override
    public abstract void attack(BattleUnit other);
}
