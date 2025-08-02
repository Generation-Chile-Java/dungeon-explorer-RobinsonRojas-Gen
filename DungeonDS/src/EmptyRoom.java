class EmptyRoom extends BaseRoom {
    public EmptyRoom() {
        this.description = "Una sala vacía con paredes de piedra húmeda.";
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entras en " + getDescription());
        System.out.println("No hay nada interesante aquí.");
    }
}
