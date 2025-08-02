
public class Page implements GameObject {
    private String name;

    public Page(String name) {
        this.name = name;
    }

    public void interact(Player player) {
        System.out.println("Revisaste la página. Una nota críptica te deja frío.");
    }

    public String getName() {
        return name;
    }
}
