class Dragon implements GameObject {
    private final int damage;

    public Dragon(int damage) {
        this.damage = damage;
    }

    @Override
    public void interact(Player player) {
        System.out.println("¡El dragón lanza un rugido y escupe fuego!");
        player.takeDamage(damage);
    }

    @Override
    public String getName() {
        return "Dragón";
    }
}