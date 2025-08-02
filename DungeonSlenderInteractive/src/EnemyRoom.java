public class EnemyRoom implements Room {
    private GameObject enemy;

    public EnemyRoom(GameObject enemy) {
        this.enemy = enemy;
    }

    public void enter(Player player) {
        System.out.println("¡Una presencia oscura te rodea!");
        enemy.interact(player);
    }
}
