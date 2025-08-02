abstract class BaseRoom implements Room {
    protected String description;

    @Override
    public String getDescription() {
        return description;
    }
}