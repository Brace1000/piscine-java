public class Sorcerer extends Character implements Healer {
    private final int healCapacity;
    
    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }
    
    @Override
    public int getHealCapacity() {
        return healCapacity;
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
        // Then deal 10 damage
        target.takeDamage(10);
    }
    
    @Override
    public void takeDamage(int amount) {
        // Take all damage
        setCurrentHealth(getCurrentHealth() - amount);
    }
    
    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity + " HP.";
        } else {
            return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP.";
        }
    }
}