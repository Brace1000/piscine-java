import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    
    private static List<Character> allCharacters = new ArrayList<>();
    
    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
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
    
    public static String printStatus() {
        StringBuilder status = new StringBuilder();
        status.append("------------------------------------------\n");
        
        if (allCharacters.isEmpty()) {
            status.append("Nobody's fighting right now !\n");
        } else {
            status.append("Characters currently fighting :\n");
            for (Character character : allCharacters) {
                status.append(" - ").append(character.toString()).append("\n");
            }
        }
        
        status.append("------------------------------------------\n");
        return status.toString();
    }
    
    public static Character fight(Character first, Character second) {
        while (first.getCurrentHealth() > 0 && second.getCurrentHealth() > 0) {
            // First attacks second
            first.attack(second);
            if (second.getCurrentHealth() == 0) {
                break;
            }
            
            // Second attacks first
            second.attack(first);
            if (first.getCurrentHealth() == 0) {
                break;
            }
        }
        
        // Return the winner (the one who still has health)
        if (first.getCurrentHealth() > 0) {
            return first;
        } else {
            return second;
        }
    }
}