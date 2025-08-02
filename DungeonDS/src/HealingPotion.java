class HealingPotion implements GameObject {
    private final int healingAmount;

    public HealingPotion(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    @Override
    public void interact(Player player) {
        int initialHealth = player.getHealth();
        int newHealth = initialHealth + healingAmount;
        System.out.println("Bebes una poción de curación y recuperas " + healingAmount + " puntos de vida.");
        player.addToInventory("Poción de curación (usada)");
    }

    @Override
    public String getName() {
        return "Poción de curación";
    }
}