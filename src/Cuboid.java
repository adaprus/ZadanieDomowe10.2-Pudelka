public class Cuboid extends Box {
    private double width;
    private double depth;

    public Cuboid(double height, double width, double depth) {
        super(height);
        this.width = width;
        this.depth = depth;
        type = "Cuboid";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double countVolume() {
        return width * depth * getHeight();
    }

    @Override
    public String toString() {
        return "Cuboid: height = " + getHeight() +
                ", width = " + width +
                ", depth = " + depth;
    }

    @Override
    public double maxBottomDimension() {
        return Math.sqrt(Math.pow(width, 2 ) + Math.pow(depth, 2));
    }
}
