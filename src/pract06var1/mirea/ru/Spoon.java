package pract06var1.mirea.ru;

public class Spoon extends Dish {
    private String type;

    public Spoon(String type) {
        super("не определён");
        this.type = type;
    }

    public Spoon(String material, String type) {
        super(material);
        this.type = type;
    }

    @Override
    String dishUse() {
        return "Употреблять жидкую пищу";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
