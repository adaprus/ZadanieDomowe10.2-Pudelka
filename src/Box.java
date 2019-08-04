public class Box {
    private double height;
    private String material;
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Box(double height) {
        this.height = height;
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double countVolume(){
        double volume = 0;
        return volume;
    }

    public double maxBottomDimension(){
        double maxDimension = 0;
        return maxDimension;
    }

    @Override
    public String toString() {
        return "Box: height = " + height;
    }
}
