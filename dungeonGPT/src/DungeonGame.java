import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del jugador: ");
        String name = scanner.nextLine();

        Player player = new Player(name, 100);

        Room[] dungeon = {
                new EmptyRoom(),
                new TreasureRoom(),
                new EnemyRoom(),
                new TreasureRoom(),
                new EnemyRoom(),
                new EmptyRoom()
        };

        for (int i = 0; i < dungeon.length; i++) {
            if (!player.isAlive()) {
                System.out.println("¡Has muerto! Juego terminado.");
                break;
            }

            System.out.println("\nSala " + (i + 1) + ":");
            dungeon[i].enter(player);
            player.showStatus();

            if (i < dungeon.length - 1) {
                System.out.print("Presiona Enter para continuar...");
                scanner.nextLine();
            }
        }

        if (player.isAlive()) {
            System.out.println("\n¡Felicidades! Has explorado toda la mazmorra.");
        }

        scanner.close();
    }
}