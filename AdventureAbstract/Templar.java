public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;
    
    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }
    
    @Override
    public int getHealCapacity() {
        return healCapacity;
    }
    
    @Override
    public int getShield() {
        return shield;
    }
    
    @Override
    public void heal(Character character) {
        if (character.getCurrentHealth() > 0) {
            int newHealth = character.getCurrentHealth() + healCapacity;
            if (newHealth > character.getMaxHealth()) {
                character.setCurrentHealth(character.getMaxHealth());
            } else {
                character.setCurrentHealth(newHealth);
            }
        }
    }
    
    @Override
    public void attack(Character target) {
        // Heal itself first
        this.heal(this);
        // Then deal 6 damage
        target.takeDamage(6);
    }
    
    @Override
    public void takeDamage(int amount) {
        // Take damage minus shield value
        int actualDamage = Math.max(0, amount - shield);
        setCurrentHealth(getCurrentHealth() - actualDamage);
    }
    
    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity + " HP.";
        } else {
            return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP and has a shield of " + shield + ".";
        }
    }
}