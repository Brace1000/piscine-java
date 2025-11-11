public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    
    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
    
    public int getCurrentHealth() {
        return currentHealth;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        if (currentHealth == 0) {
            return name + " : KO";
        } else {
            return name + " : " + currentHealth + "/" + maxHealth;
        }
    }
    
    public void takeDamage(int amount) {
        currentHealth -= amount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }
    
    public void attack(Character target) {
        target.takeDamage(9);
    }
}