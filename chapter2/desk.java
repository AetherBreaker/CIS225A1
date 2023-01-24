package chapter2;

import java.util.EnumMap;

public class Desk {
    private float length;
    private float width;

    private float price;
    enum Material {
        MAHOGANY, OAK, PINE
    }


    public Desk(float length, float width, Material material) {
        this.length = length;
        this.width = width;
        this.material = material;
    }

    public static void main(String[] args) {
        Desk desk = new Desk(1.0f, 2.0f, Material.MAHOGANY);
    }
}
