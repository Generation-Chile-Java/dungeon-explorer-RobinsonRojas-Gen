
public class Slender implements GameObject {
    private int damage;

    public Slender(int damage) {
        this.damage = damage;
    }

    public void interact(Player player) {
        System.out.println("Slenderman aparece repentinamente y te ataca con su mirada...");
        player.takeDamage(damage);
    }

    public String getName() {
        return "Slenderman";
    }
}
