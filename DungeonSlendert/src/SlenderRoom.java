public class SlenderRoom implements Room {
    private GameObject slender;

    public SlenderRoom() {
        this.slender = new Slender("Slenderman", 25);
    }

    public void enter(Player player) {
        System.out.println("Sientes que alguien te observa...");
        slender.interact(player);
    }
}