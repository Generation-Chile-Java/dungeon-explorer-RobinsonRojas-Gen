import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<String> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " ha sido afectado por Slenderman. Salud: " + health);
    }

    public void addItem(String item) {
        inventory.add(item);
        System.out.println(name + " encontró una página: " + item);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public boolean hasAllPages(int totalPages) {
        return inventory.size() >= totalPages;
    }

    public void showStatus() {
        System.out.println("Estado: " + name + " | Salud: " + health + " | Páginas: " + inventory.size());
    }
}