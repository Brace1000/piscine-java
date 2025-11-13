public class Sorcerer extends Character implements Healer {
    private final int healCapacity;
    
    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth, null);
        this.healCapacity = healCapacity;
    }
    
    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }
    
    @Override
    public int getHealCapacity() {
        return healCapacity;
    }
    
    @Override
    public void heal(Character character) throws DeadCharacterException {
        checkIfAlive(); // Throws DeadCharacterException if dead
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
    public void attack(Character target) throws DeadCharacterException {
        checkIfAlive(); // Throws DeadCharacterException if dead
        // Heal itself first
        this.heal(this);
        // Then deal damage (weapon or default 10)
        int damage = getAttackDamage(10);
        target.takeDamage(damage);
    }
    
    @Override
    public void takeDamage(int amount) throws DeadCharacterException {
        checkIfAlive(); // Throws DeadCharacterException if dead
        // Take all damage
        setCurrentHealth(getCurrentHealth() - amount);
    }
    
    @Override
    public String toString() {
        String baseString;
        if (getCurrentHealth() == 0) {
            baseString = getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity + " HP.";
        } else {
            baseString = getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP.";
        }
        
        if (getWeapon() != null) {
            baseString += ". He has the weapon " + getWeapon().toString();
        }
        
        return baseString;
    }
}