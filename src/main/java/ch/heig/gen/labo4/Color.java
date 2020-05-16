package ch.heig.gen.labo4;

public enum Color {
    BLUE("blue"), RED("red"), YELLOW("yellow");
    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
