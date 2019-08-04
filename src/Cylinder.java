public class Cylinder extends Box {
    private double diameter;

    public Cylinder(double height, double diameter) {
        super(height);
        this.diameter = diameter;
        type = "Cylinder";
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double countVolume() {
        return Math.PI * Math.pow((diameter / 2), 2) * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder: height = " + getHeight()
                + ", diameter = " + diameter;
    }

    @Override
    public double maxBottomDimension() {
        return diameter;
    }
}
