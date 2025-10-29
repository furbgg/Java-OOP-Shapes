package Test;

import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

    class CircleTest {
        @Test
        void getArea_calculatesCorrectly() {
            Shapes Circle = new Circle("Rot" , true , 10.0);
            double ActualArea = Circle.getArea();
            double expetedArea = 314.15926535;
            assertEquals(expetedArea,ActualArea,0.001);
        }
        @Test
        void constructor_throwsExpection_forNegative () {
            assertThrows(IllegalArgumentException.class, () -> {
                new Circle("Grun " , true , -10.0);
            });
        }

    }