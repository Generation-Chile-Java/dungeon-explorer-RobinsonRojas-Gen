class GoldTreasure implements GameObject {
    private final int amount;

    public GoldTreasure(int amount) {
        this.amount = amount;
    }

    @Override
    public void interact(Player player) {
        player.addToInventory("bolsa de " + amount + " monedas de oro");
    }

    @Override
    public String getName() {
        return "bolsa de " + amount + " monedas de oro";
    }
}