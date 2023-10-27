package pract06var1.mirea.ru;

public class Test {
    public static void main(String[] args) {
        Plate plate1 = new Plate("фарфор", 15, "белая");
        Plate plate2 = new Plate("фаянс", 5, "хохлома");
        Fork fork1 = new Fork("Пластиковая", 3, "бомжацкая");
        Fork fork2 = new Fork("серебро", 3, "десертная");
        Spoon spoon1 = new Spoon("аллюминий", "столовая");
        Spoon spoon2 = new Spoon("сталь", "чайная");
        System.out.println(plate1);
        System.out.println(plate2);
        System.out.println(fork1);
        System.out.println(fork2);
        System.out.println(spoon1);
        System.out.println(spoon2);
        System.out.println("----------------------");
        plate2.setMaterial("глина");
        plate2.setColor("гжель");
        fork1.setType("быстрое питание");
        spoon2.setMaterial("мельхиор");
        System.out.println(plate1);
        System.out.println(plate2);
        System.out.println(fork1);
        System.out.println(fork2);
        System.out.println(spoon1);
        System.out.println(spoon2);
        System.out.println(plate1.dishUse());
        System.out.println(fork1.dishUse());
        System.out.println(spoon2.dishUse());

    }
}
