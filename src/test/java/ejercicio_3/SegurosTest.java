package ejercicio_3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SegurosTest {

    @Test
    public void segurosTest() {
        var seguroMedico = new SeguroSimple("seguro por caida", 100.0);
        var seguroHogar = new SeguroSimple("Seguro por robo", 200.0);

        var paquete1 = new PaqueteSeguros("paquete plus", seguroMedico);
        paquete1.agregarSeguro(seguroHogar);

        var seguroVida = new SeguroSimple("Seguro por accidente", 300.0);
        var paquete2 = new PaqueteSeguros("paquete base", seguroVida);

        paquete1.agregarSeguro(paquete2);
        assertEquals(510.0, paquete1.subtotalSeguros());
    }

    @Test
    public void conPersona() {
        var seguroMedico = new SeguroSimple("seguro por caida", 100.0);
        var seguroHogar = new SeguroSimple("Seguro por robo", 200.0);

        var paquete1 = new PaqueteSeguros("paquete plus", seguroMedico);
        paquete1.agregarSeguro(seguroHogar);

        var seguroVida = new SeguroSimple("Seguro por accidente", 300.0);
        var paquete2 = new PaqueteSeguros("paquete base", seguroVida);

        paquete1.agregarSeguro(paquete2);

        var persona = new Persona("Juan Perez", List.of(paquete1));
        assertEquals(510.0, persona.totalSeguros());
    }
}
