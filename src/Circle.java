

public class Circle extends Shapes {
private  double radius;

public double getArea() {
return (Math.PI * radius*radius);
}
public double getPerimeter() {
    return (2*Math.PI*radius);
}
public Circle(String color,boolean isFilled , double radius) {
    super(color , isFilled);

    if (radius<0) {
        throw new IllegalArgumentException("Fehler. Muss Positiv sein!");
    }

    this.radius = radius;
}
}
