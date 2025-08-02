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
        System.out.println(name + " recibió " + damage + " de daño. Salud restante: " + health);
    }

    public void addItem(String item) {
        inventory.add(item);
        System.out.println(name + " recogió un " + item + ".");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStatus() {
        System.out.println("Jugador: " + name + ", Salud: " + health + ", Inventario: " + inventory);
    }
}