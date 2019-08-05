public class CuboidProduct extends Product {
    double width;
    double depth;


    public CuboidProduct(double price, double height, double width, double depth) {
        super(price, height);
        this.width = width;
        this.depth = depth;
    }

    @Override
    public double maxBottomDimension() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(depth, 2));
    }

    @Override
    public double countVolume() {
        return getHeight() * width * depth;
    }

    @Override
    public String toString() {
        return "CuboidProduct: height = " + getHeight()
                + ", widht = " + width
                + ", depth = " + depth;
    }

    @Override
    public Box[] checkIfFits(Box[] boxes) {
        Box[] boxes1 = new Box[boxes.length];
        int firstEmpty = 0;

        System.out.println("Pasujące pudełka: ");

        for (int i = 0; i < boxes.length; i++) {
            String type = boxes[i].getType();
            switch (type) {
                case "Cylinder":
                    if (boxes[i].maxBottomDimension() - maxBottomDimension() >= 0
                            && boxes[i].getHeight() - getHeight() >= 0) {
                        boxes1[firstEmpty] = boxes[i];
                        System.out.println(boxes[i].toString());
                        firstEmpty++;
                    }
                        break;
                case "Cuboid":
                    if (((Cuboid) boxes[i]).getDepth() >= depth && ((Cuboid) boxes[i]).getWidth() >= width
                            && boxes[i].getHeight() - getHeight() >= 0
                    || ((Cuboid) boxes[i]).getDepth() >= width && ((Cuboid) boxes[i]).getWidth() >= depth
                            && boxes[i].getHeight() - getHeight() >= 0 ) {
                        boxes1[firstEmpty] = boxes[i];
                        System.out.println(boxes[i].toString());
                        firstEmpty++;
                    }
                    break;
            }
        }
        Box[] boxes2 = new Box[firstEmpty];

        for (int i = 0; i < firstEmpty; i++) {
            boxes2[i] = boxes1[i];
        }
        return boxes2;
    }
}
