import java.util.Arrays;

public class Sphere extends Product {
    public Sphere() {
    }

    public Sphere(double price, double height) {
        super(price, height);
    }

    @Override
    public double countVolume() {
        double diameter = getHeight();
        return ((4 / 3) * Math.PI * Math.pow((diameter / 2), 3));
    }

    @Override
    public String toString() {
        return "Sphere diameter: " + getHeight();
    }

    @Override
    public double maxBottomDimension() {
        return getHeight();
    }

    @Override
    public Box[] checkIfFits(Box[] boxes) {
        Box[] boxes1 = new Box[boxes.length];
        int firstEmpty = 0;

        System.out.println("Pasujące pudełka: ");
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].maxBottomDimension() - maxBottomDimension() >= 0
                    && boxes[i].getHeight() - getHeight() >= 0) {
                boxes1[firstEmpty] = boxes[i];
                System.out.println(boxes[i].toString());
                firstEmpty++;
            }
        }

        Box[] boxes2 = new Box[firstEmpty];
        for (int i = 0; i < firstEmpty; i++) {
            boxes2[i] = boxes1[i];
        }

        return boxes2;
    }
}
