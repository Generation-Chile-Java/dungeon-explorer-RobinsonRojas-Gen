public class Slender implements GameObject {
    private String name;
    private int damage;

    public Slender(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void interact(Player player) {
        System.out.println(name + " aparece de la nada... ¡te sientes paralizado!");
        player.takeDamage(damage);
    }
}