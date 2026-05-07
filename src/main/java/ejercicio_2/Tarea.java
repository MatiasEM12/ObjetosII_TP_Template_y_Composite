package ejercicio_2;

import java.time.Duration;

public class Tarea implements ItemTrabajo {

    private String nombre;
    private Duration tiempo;

    public Tarea(String nombre, Duration tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public Duration calcularTiempo() {
        return tiempo;
    }
}
