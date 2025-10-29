package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
@Test
    void getArea_CalculatesCorrectly (){
        Shapes square = new Square("rot",true , 6);
        double actualArea = square.getArea();
        double expentedArea = 36;
        assertEquals(expentedArea,actualArea,0.001);
    }
@Test
    void constructor_ThrowExpection_forNegativeSide() {
    assertThrows(IllegalArgumentException.class, () -> {
        new Square("Schweiss" , true ,-5.0);
    });

    assertThrows(IllegalArgumentException.class ,() -> {
        new Square("Rot" , true , 0.0);
    });
}
@Test
    void getPerimeter() {
    Shapes square = new Square("Rot" , true , 5.0);
    double actuelPa = square.getPerimeter();
    double expentedPa = 20;
    assertEquals(expentedPa , actuelPa , 0.001);
}


}