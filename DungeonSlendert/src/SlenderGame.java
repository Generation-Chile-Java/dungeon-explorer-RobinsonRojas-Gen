import java.util.Scanner;

public class SlenderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre, explorador: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName, 100);

        Room[] dungeon = {
                new EmptyRoom(),
                new PageRoom("Página 1"),
                new SlenderRoom(),
                new PageRoom("Página 2"),
                new EmptyRoom(),
                new SlenderRoom(),
                new PageRoom("Página 3"),
                new SlenderRoom(),
                new PageRoom("Página 4"),
                new EmptyRoom()
        };

        int totalPages = 4;

        for (int i = 0; i < dungeon.length; i++) {
            if (!player.isAlive()) {
                System.out.println("Slenderman te ha atrapado... Fin del juego.");
                break;
            }

            System.out.println("\nSala " + (i + 1) + ":");
            dungeon[i].enter(player);
            player.showStatus();

            if (player.hasAllPages(totalPages)) {
                System.out.println("¡Has recolectado todas las páginas y escapado de Slenderman!");
                break;
            }

            if (i < dungeon.length - 1) {
                System.out.print("Presiona Enter para continuar...");
                scanner.nextLine();
            }
        }

        if (player.isAlive() && !player.hasAllPages(totalPages)) {
            System.out.println("Has sobrevivido... pero no encontraste todas las páginas.");
        }

        scanner.close();
    }
}