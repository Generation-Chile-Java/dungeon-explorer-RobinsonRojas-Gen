public class EnemyRoom implements Room {
    private GameObject enemy;

    public EnemyRoom() {
        this.enemy = new Enemy("Orco", 20);
    }

    public void enter(Player player) {
        System.out.println("Entraste a una sala con un enemigo.");
        enemy.interact(player);
    }
}