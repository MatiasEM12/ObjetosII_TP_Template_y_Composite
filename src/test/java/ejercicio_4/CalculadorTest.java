package ejercicio_4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {


    @Test
    public void JubiladoTest() {
        var log = new LogTransaction();
        var calculador = new CalculadorJubilado(log, LocalDate.now().getMonthValue());
        var precio = calculador.calcularPrecio(100.0);
        assertEquals(110.0, precio);
    }

    @Test
    public void NoJubiladoMesPromocion() {
        var log = new LogTransaction();
        var calculador = new CalculadorNoJubilado(log, LocalDate.now().getMonthValue());
        var precio = calculador.calcularPrecio(100.0);
        assertEquals(115.0, precio);
    }

    @Test
    void NoJubiladoSinPormocion() {

        var log = new LogTransaction();
        var calculador = new CalculadorNoJubilado(log, LocalDate.now().getMonthValue() + 1);
        var precio = calculador.calcularPrecio(100.0);
        assertEquals(121.0, precio);
    }
}
