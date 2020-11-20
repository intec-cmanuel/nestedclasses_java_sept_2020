package be.intecbrussel.demo;

public class Paint {
    private Color color;

    public Paint(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "The paint is colored: " + color;
    }

    public enum Color {
        RED, BLUE, YELLOW, BLACK
    }
}
