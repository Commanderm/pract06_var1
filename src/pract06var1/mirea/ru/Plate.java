package pract06var1.mirea.ru;

public class Plate extends Dish {
    private int radius;
    private String color;

    public Plate(int radius, String color) {
        super("не определён");
        this.radius = radius;
        this.color = color;
    }

    public Plate(String material, int radius, String color) {
        super(material);
        this.radius = radius;
        this.color = color;
    }

    @Override
    String dishUse() {
        return "положить еды";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
