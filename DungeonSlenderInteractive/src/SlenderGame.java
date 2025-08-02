import java.util.Scanner;

public class SlenderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tu nombre: ");
        String name = scanner.nextLine();
        Player player = new Player(name, 100);

        Room[] dungeon = {
                new EmptyRoom(),
                new TreasureRoom(new Page("Página 1")),
                new EnemyRoom(new Slender(20)),
                new TreasureRoom(new Medkit(30)),
                new EnemyRoom(new Slender(30)),
                new TreasureRoom(new Page("Página 2")),
                new EmptyRoom()
        };

        int roomIndex = 0;

        while (player.isAlive() && roomIndex < dungeon.length) {
            System.out.println("\nSala " + (roomIndex + 1));
            dungeon[roomIndex].enter(player);
            player.showStatus();

            boolean validInput = false;
            while (!validInput) {
                System.out.print("Acción (1: Continuar, 2: Ver inventario, 3: Usar objeto): ");
                String input = scanner.nextLine();
                switch (input) {
                    case "1":
                        roomIndex++;
                        validInput = true;
                        break;
                    case "2":
                        player.showInventory();
                        break;
                    case "3":
                        player.useItem();
                        break;
                    default:
                        System.out.println("Entrada no válida.");
                }
            }
        }

        if (!player.isAlive()) {
            System.out.println("Slenderman te ha atrapado. Fin del juego.");
        } else {
            System.out.println("¡Has escapado de la mazmorra con vida!");
        }
    }
}
