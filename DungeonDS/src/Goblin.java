class Goblin implements GameObject {
    private final int damage;

    public Goblin(int damage) {
        this.damage = damage;
    }

    @Override
    public void interact(Player player) {
        System.out.println("¡El goblin te ataca con su garrote!");
        player.takeDamage(damage);
    }

    @Override
    public String getName() {
        return "Goblin";
    }
}