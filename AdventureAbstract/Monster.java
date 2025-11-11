public class Monster extends Character {
    
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }
    
    @Override
    public void attack(Character target) {
        target.takeDamage(7); // Deal 7 damage
    }
    
    @Override
    public void takeDamage(int amount) {
        int actualDamage = (int) Math.floor(amount * 0.8); // Take 80% of damage (rounded down)
        setCurrentHealth(getCurrentHealth() - actualDamage);
    }
    
    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return getName() + " is a monster with " + getCurrentHealth() + " HP";
        } else {
            return getName() + " is a monster and is dead";
        }
    }
}