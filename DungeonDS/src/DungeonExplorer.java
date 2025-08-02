import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DungeonExplorer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Explorador de Mazmorras!");
        System.out.print("Ingresa tu nombre, aventurero: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName, 100);

        // Crear las salas de la mazmorra
        List<Room> dungeon = new ArrayList<>();
        dungeon.add(new EmptyRoom());
        dungeon.add(new TreasureRoom(new GoldTreasure(50)));
        dungeon.add(new EnemyRoom(new Goblin(15)));
        dungeon.add(new TreasureRoom(new HealingPotion(20)));
        dungeon.add(new EmptyRoom());
        dungeon.add(new EnemyRoom(new Dragon(30)));
        dungeon.add(new TreasureRoom(new GoldTreasure(100)));

        System.out.println("\n¡" + playerName + ", has entrado en la mazmorra!");
        System.out.println("Explora las salas y sobrevive a sus peligros.\n");

        // Bucle principal del juego
        for (int i = 0; i < dungeon.size(); i++) {
            if (!player.isAlive()) {
                break;
            }

            Room currentRoom = dungeon.get(i);
            System.out.println("\n--- Sala " + (i + 1) + " de " + dungeon.size() + " ---");
            System.out.println("1. Entrar en la sala");
            System.out.println("2. Ver estado del jugador");
            System.out.println("3. Rendirse (salir de la mazmorra)");
            System.out.print("Elige una opción: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentRoom.enter(player);
                    break;
                case 2:
                    player.showStatus();
                    i--; // Permanece en la misma sala
                    break;
                case 3:
                    System.out.println("Decides salir de la mazmorra. ¡Hasta la próxima!");
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    i--; // Permanece en la misma sala
            }
        }

        // Final del juego
        if (player.isAlive()) {
            System.out.println("\n¡Felicidades " + player.getName() + "! Has explorado toda la mazmorra.");
        } else {
            System.out.println("\n¡La mazmorra ha reclamado otra víctima!");
        }

        player.showStatus();
        scanner.close();
    }
}