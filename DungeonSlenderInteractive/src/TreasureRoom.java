public class TreasureRoom implements Room {
    private GameObject treasure;

    public TreasureRoom(GameObject treasure) {
        this.treasure = treasure;
    }

    public void enter(Player player) {
        System.out.println("¡Encontraste un objeto!");
        player.addItem(treasure);
    }
}
