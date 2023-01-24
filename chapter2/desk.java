package chapter2;

public class Desk {
    private float length;
    private float width;
    private Material material;
    private float price;

    public enum Material {
        MAHOGANY, OAK, PINE
    }

    public Desk(float length, float width, Material material) {
        this.length = length;
        this.width = width;
        this.material = material;
    }

    public static void main(String[] args) {
        float desklen = Float.parseFloat(System.console().readLine("Enter desk length: "));
        float deskwid = Float.parseFloat(System.console().readLine("Enter desk width: "));
        Desk desk = new Desk(desklen, deskwid, Material.MAHOGANY);
    }
}
