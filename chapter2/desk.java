package chapter2;

public class Desk {
    private float length;
    private float width;
    private Material material;
    private float price;

    private enum Material {
        MAHOGANY, OAK, PINE
    }

    public Desk(float length, float width, Material material) {
        this.length = length;
        this.width = width;
        this.material = material;
    }

    public static void main(String[] args) {
        Desk desk = new Desk(
                Float.parseFloat(System.console().readLine("Enter desk length: ")),
                Float.parseFloat(System.console().readLine("Enter desk width: ")),
                Material.MAHOGANY);
    }
}
