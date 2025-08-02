class EnemyRoom extends BaseRoom {
    private final GameObject enemy;
    private boolean defeated = false;

    public EnemyRoom(GameObject enemy) {
        this.enemy = enemy;
        this.description = "Una sala oscura con un aura amenazante.";
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entras en " + getDescription());

        if (!defeated) {
            System.out.println("¡Un " + enemy.getName() + " te ataca!");
            enemy.interact(player);
            defeated = true;
        } else {
            System.out.println("El " + enemy.getName() + " ya ha sido derrotado.");
        }
    }
}