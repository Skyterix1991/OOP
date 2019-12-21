package inheritance;

public class NPC {

    private String name;

    private int strength;

    private int healthPoints;

    public NPC(String name, int strength, int healthPoints) {
        this.name = name;
        this.strength = strength;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attack() {
        System.out.println(name + " attacked!");
    }
}
