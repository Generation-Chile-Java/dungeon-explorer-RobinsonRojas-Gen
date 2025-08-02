class TreasureRoom extends BaseRoom {
    private final GameObject treasure;

    public TreasureRoom(GameObject treasure) {
        this.treasure = treasure;
        this.description = "Una sala iluminada con un brillo dorado.";
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entras en " + getDescription());
        System.out.println("¡Has encontrado un " + treasure.getName() + "!");
        treasure.interact(player);
    }
}