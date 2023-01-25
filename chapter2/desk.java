package chapter2;

public class Desk {
    private int orderNum;
    private String orderName;
    private float length;
    private float width;
    private int drawers;
    private int material;

    <<<<<<<HEAD

    public Desk(int ordernum, String ordername, float length, float width, int drawers, int material) {
        this.orderNum = ordernum;
        this.orderName = ordername;
=======
    private enum Material {
        MAHOGANY, OAK, PINE
    }

    public Desk(float length, float width, Material material) {
>>>>>>> c0eb76949d62e2c04421e84d2bb2decee3dd3886
        this.length = length;
        this.width = width;
        this.drawers = drawers;
        this.material = material;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getDrawers() {
        return drawers;
    }

    public void setDrawers(int drawers) {
        this.drawers = drawers;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int price() {
        int price = 200;
        switch (material) {
            case 1:
                price += 150;
                break;
            case 2:
                price += 125;
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid material");
                break;
        }
        price += drawers * 30;

        if ((length * width) > 750) {
            price += 50;
        }
        return price;
    }

    public static void main(String[] args) {
        int ordernum = Integer.parseInt(System.console().readLine("Enter order number: "));
        String ordername = System.console().readLine("Enter customer name: ");
        float desklen = Float.parseFloat(System.console().readLine("Enter desk length: "));
        float deskwid = Float.parseFloat(System.console().readLine("Enter desk width: "));
        int deskdrawers = Integer.parseInt(System.console().readLine("Enter number of drawers: "));
        int material = Integer.parseInt(System.console().readLine("Enter material\n1 = Mahogony\n2 = Oak\n3 = Pine: "));
        Desk desk = new Desk(ordernum, ordername, desklen, deskwid, deskdrawers, material);
        System.out.println("Order number: " + desk.orderNum);
        System.out.println("Customer name: " + desk.orderName);
        System.out.println("Desk length: " + desk.length);
        System.out.println("Desk width: " + desk.width);
        System.out.print("Material: ");
        switch (desk.material) {
            case 1:
                System.out.println("Mahogony");
                break;
            case 2:
                System.out.println("Oak");
                break;
            case 3:
                System.out.println("Pine");
                break;
            default:
                System.out.println("Invalid material");
                break;
        }
        System.out.println("Number of drawers: " + desk.drawers);
        System.out.println("Price: $" + desk.price() + ".00");
    }
}