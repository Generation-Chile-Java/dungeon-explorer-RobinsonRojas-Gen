public class TreasureRoom implements Room {
    private GameObject treasure;

    public TreasureRoom() {
        this.treasure = new Treasure("Oro");
    }

    public void enter(Player player) {
        System.out.println("Entraste a una sala con un tesoro.");
        treasure.interact(player);
    }
}