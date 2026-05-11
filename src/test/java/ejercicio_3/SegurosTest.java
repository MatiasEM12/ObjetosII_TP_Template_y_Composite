package ejercicio_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SegurosTest {

    @Test
    public void segurosTest() {
        var seguroMedico = new SeguroSimple(100.0);
        var seguroHogar = new SeguroSimple(200.0);

        var paquete1 = new PaqueteSeguros(seguroMedico);
        paquete1.agregarSeguro(seguroHogar);

        var seguroVida = new SeguroSimple(300.0);
        var paquete2 = new PaqueteSeguros(seguroVida);

        paquete1.agregarSeguro(paquete2);
        assertEquals(510.0, paquete1.subtotalSeguros());
    }
}
