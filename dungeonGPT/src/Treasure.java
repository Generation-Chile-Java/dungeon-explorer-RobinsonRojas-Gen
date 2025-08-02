public class Treasure implements GameObject {
    private String name;

    public Treasure(String name) {
        this.name = name;
    }

    public void interact(Player player) {
        player.addItem(name);
    }
}