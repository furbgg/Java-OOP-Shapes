public class Rectangle extends  Shapes {
    private double width;
    private  double length;

    public Rectangle(String color, boolean isFilled, double width,double length) {
        super(color, isFilled);

        if (width<=0 || length<=0) {
            throw new IllegalArgumentException("Fehler. Muss Positiv sein!");
        }
        this.width = width;
        this.length = length;
    }

    public double getArea () {
        return (width*length);
    }
    public double getPerimeter() {
        return (width+length)*2;
    }
}
