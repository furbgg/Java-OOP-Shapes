package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void getArea_correctly () {
        Shapes rectangle = new Rectangle("Blau" , true, 5.0,4.0);
        double actualArea = rectangle.getArea();
        double expentedArea = 20;
        assertEquals(expentedArea,actualArea,0.001);
    }
    @Test
    void  getPeri_correctly() {
        Shapes rectangle = new Rectangle("Blau" , true,10,11);
        double actualPeri = rectangle.getPerimeter();
        double expentedPeri = 42;
        assertEquals(expentedPeri,actualPeri,0.001);

    }

@Test
    void thrwosExpection_forNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Weiss" , true, -1.0,-4.0);
        } );
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Schwarz" , true, 0.0,0.0);
        });
}
}