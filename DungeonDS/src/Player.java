import java.util.ArrayList;
import java.util.List;

class Player {
    private final String name;
    private int health;
    private final List<String> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " recibe " + damage + " puntos de daño.");
        if (health <= 0) {
            System.out.println("¡Oh no! " + name + " ha sido derrotado.");
        } else {
            System.out.println("Vida restante: " + health);
        }
    }

    public void addToInventory(String item) {
        inventory.add(item);
        System.out.println("¡" + item + " añadido al inventario!");
    }

    public void showStatus() {
        System.out.println("\n--- Estado de " + name + " ---");
        System.out.println("Vida: " + health);
        System.out.println("Inventario: " + (inventory.isEmpty() ? "Vacío" : inventory));
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}