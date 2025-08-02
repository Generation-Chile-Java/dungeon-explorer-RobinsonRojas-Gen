public class EmptyRoom implements Room {
    public void enter(Player player) {
        System.out.println("La habitación está oscura... pero vacía.");
    }
}