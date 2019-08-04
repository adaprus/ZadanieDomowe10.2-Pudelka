public class Product {
    private double price;
    private double height;

    public Product() {
    }

    public Product(double price, double height) {
        this.price = price;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", height=" + height +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Box[] checkIfFits(Box[] boxes){
        return boxes;
    }
}
