package ejercicio_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemerasTest {


    @Test
    public void calcularRemeraImportada() {

        var comercio = new Comercio("comercio test");
        Remera remeraImportada = new RemeraImportada(100.0);
        var precio = comercio.calcularPrecioRemeraImportada(remeraImportada);

        assertEquals(133, precio);
    }

    @Test
    public void calcularRemeraNacional() {
        var comercio = new Comercio("comercio test");
        Remera remeraNacional = new RemeraNacional(100.0);
        var precio = comercio.calcularPrecioRemeraNacional(remeraNacional);

        assertEquals(135.15, precio);
    }
}
