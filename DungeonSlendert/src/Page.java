public class Page implements GameObject {
    private String title;

    public Page(String title) {
        this.title = title;
    }

    public void interact(Player player) {
        player.addItem(title);
    }
}