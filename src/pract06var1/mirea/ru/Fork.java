package pract06var1.mirea.ru;

public class Fork extends Dish {
    private int teeth;
    private String type;

    public Fork(int teeth, String type) {
        super("не определён");
        this.teeth = teeth;
        this.type = type;
    }

    public Fork(String material, int teeth, String type) {
        super(material);
        this.teeth = teeth;
        this.type = type;
    }

    @Override
    String dishUse() {
        return "Употреблять твёрдую пищу";
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fork{" +
                "teeth=" + teeth +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
