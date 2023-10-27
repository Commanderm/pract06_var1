package pract06var1.mirea.ru;

public abstract class Dish {
    protected String material;

    public Dish(){}

    public Dish(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    abstract String dishUse();
}
