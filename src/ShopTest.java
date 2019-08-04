public class ShopTest {
    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        boxes[0] = new Cylinder(10, 10);
        boxes[1] = new Cylinder(5, 10);
        boxes[2] = new Cuboid(15, 10, 10);
        boxes[3] = new Cuboid(10, 10, 10);
        boxes[4] = new Cuboid(7.5, 10, 10);

        Product[] products = new Product[4];
        products[0] = new Sphere(10, 10);
        products[1] = new Sphere(5, 7.5);
        products[2] = new CuboidProduct(20, 10, 10, 10);
        products[3] = new CuboidProduct(23, 12, 7, 6);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
            Box[] matchingBoxes = products[i].checkIfFits(boxes);
            System.out.println("Najlepiej dopasowane pudełko: " + countSpareVolume(matchingBoxes, products[i]).toString());
            System.out.println();
        }
    }

    private static Box countSpareVolume(Box[] boxes, Product product) {
        double minSpareVolume = boxes[0].countVolume() - product.countVolume();
        int minIndex = 0;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].countVolume() - product.countVolume() < minSpareVolume) {
                minSpareVolume = boxes[i].countVolume() - product.countVolume();
                minIndex = i;
            }
        }

        return boxes[minIndex];
    }
}
