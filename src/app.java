import java.util.ArrayList;
import java.util.List;

public class app{
    public static void main(String[] args) {
        List<Shapes> meineShapes = new ArrayList<>();
        meineShapes.add(new Circle("Rot",true,5.0));
        meineShapes.add(new Rectangle("Blau",true,4.0,6.0));
        meineShapes.add(new Square("Gelb",false,3.0));

        System.out.println("Info");

        for (Shapes s : meineShapes) {
            System.out.println("\n Shape" + s.getClass().getSimpleName());
            System.out.println("Farbe:" + s.getColor());
            System.out.println("Area : " + s.getArea());
            System.out.println("Perimeter : " + s.getPerimeter());
        }

    }
}
