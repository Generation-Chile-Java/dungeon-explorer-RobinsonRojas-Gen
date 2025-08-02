
public class Medkit implements GameObject {
    private int healingAmount;

    public Medkit(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public void interact(Player player) {
        System.out.println("Usaste un botiquín.");
        player.heal(healingAmount);
    }

    public String getName() {
        return "Botiquín (+ " + healingAmount + " salud)";
    }
}
