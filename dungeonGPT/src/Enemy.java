public class Enemy implements GameObject {
    private String type;
    private int damage;

    public Enemy(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public void interact(Player player) {
        System.out.println("¡Un " + type + " te ataca!");
        player.takeDamage(damage);
    }
}