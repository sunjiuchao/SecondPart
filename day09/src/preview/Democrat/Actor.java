package preview.Democrat;

public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public Actor() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
