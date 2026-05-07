package ejercicio_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Spike implements ItemTrabajo {

    private String nombre;
    private Duration tiempo;

    public Spike(String nombre,Duration tiempo) {
        this.nombre=nombre;
        this.tiempo = tiempo;
    }


    @Override
    public Duration calcularTiempo() {
        return tiempo;
    }
}
