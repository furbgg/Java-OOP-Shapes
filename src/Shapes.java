public abstract class Shapes {
    private String color;
    private boolean isFilled;
    public Shapes (String color , boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
