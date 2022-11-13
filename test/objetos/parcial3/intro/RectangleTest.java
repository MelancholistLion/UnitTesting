package objetos.parcial3.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    // Runner -> Junit -> Ejecuta y valida
    // Unit testing -> Unidad
    // Framework
    // Library -> Bibliotecas

    @Test
    public void testArea() {
        //Inicialización
        Rectangle rectangle = new Rectangle(10, 5);

        //Ejecución
        double area = rectangle.getArea();

        //Validación
        Assertions.assertEquals(50.0, area);
        Assertions.assertEquals(10, rectangle.getBase());
        Assertions.assertEquals(5, rectangle.getHeight());
    }

    @Test
    public void testPerimeter() {
        //Inicialización
        Rectangle rectangle = new Rectangle(10, 5);

        //Ejecución
        double perimeter = rectangle.getPerimeter();

        //Validación
        Assertions.assertEquals(30, perimeter);
        Assertions.assertEquals(10, rectangle.getBase());
        Assertions.assertEquals(5, rectangle.getHeight());
    }
}
