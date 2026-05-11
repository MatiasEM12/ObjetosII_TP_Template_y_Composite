package ejercicio_2;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProyectoTest {

    @Test
    public void tiempoProyecto() {
        var tarea = new Tarea("Tarea 1", Duration.ofHours(5));
        var spike = new Spike("Spike 1", Duration.ofHours(5));
        var historiaUsuario = new HistoriaDeUsuario("Historia 1", tarea);
        historiaUsuario.agregar(spike);

        var proyecto = new Proyecto("Proyecto 1", historiaUsuario);

        assertEquals(Duration.ofHours(10), proyecto.duracionProyecto());

    }
}
