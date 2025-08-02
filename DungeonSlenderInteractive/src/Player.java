import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private int health;
    private List<GameObject> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " ha recibido " + damage + " de daño. Salud actual: " + health);
    }

    public void heal(int amount) {
        health += amount;
        System.out.println(name + " ha recuperado " + amount + " puntos de salud. Salud actual: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void addItem(GameObject item) {
        inventory.add(item);
        System.out.println(name + " ha recogido: " + item.getName());
    }

    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        System.out.println("Inventario:");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ". " + inventory.get(i).getName());
        }
    }

    public void useItem() {
        Scanner scanner = new Scanner(System.in);
        showInventory();
        if (inventory.isEmpty()) return;

        System.out.print("Selecciona un objeto para usar (0 para cancelar): ");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= inventory.size()) {
            GameObject item = inventory.remove(choice - 1);
            item.interact(this);
        } else {
            System.out.println("Cancelado.");
        }
    }

    public void showStatus() {
        System.out.println("Jugador: " + name + " | Salud: " + health);
    }
}
