public class PageRoom implements Room {
    private GameObject page;

    public PageRoom(String title) {
        this.page = new Page(title);
    }

    public void enter(Player player) {
        System.out.println("¡Has encontrado una página pegada a la pared!");
        page.interact(player);
    }
}