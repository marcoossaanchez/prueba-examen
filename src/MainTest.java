import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    suscripcion pruebaprecio;

    @Test
    void calcularPrecio(){
       pruebaprecio = new suscripcion(20,0);
    int precioEsperado = 0;
    assertEquals(precioEsperado, pruebaprecio.precioPorMes());
    }
    @Test
    void calcularPrecio2(){
        pruebaprecio = new suscripcion(0,20);
        int precioesperado2 = 0;
        assertEquals(precioesperado2, pruebaprecio.precioPorMes());
    }
    @Test
    void calcularPrecio3(){
        pruebaprecio = new suscripcion(3,20);
        double precioesperado3 = 1.15;
        assertEquals(precioesperado3, pruebaprecio.precioPorMes());
    }
    @Test
    void calcularPrecio4(){
        pruebaprecio = new suscripcion(10,5);
        int precioesperado4 = 2;
        assertEquals(precioesperado4, pruebaprecio.precioPorMes());
    }
}