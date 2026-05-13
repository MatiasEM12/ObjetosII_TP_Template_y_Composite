package ejercicio_2;

import java.time.Duration;

public class Spike implements ItemTrabajo {

    private String nombre;
    private Duration tiempo;

    public Spike(String nombre, Duration tiempo) {
        validarNombre(nombre);
        validarDuration(tiempo);
        this.nombre = nombre;
        this.tiempo = tiempo;
    }


    @Override
    public Duration calcularTiempo() {
        return tiempo;
    }

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }

    private void validarDuration(Duration tiempo) {
        if (tiempo == null) throw new IllegalArgumentException("El tiempo no puede ser nulo");
        if (tiempo.isNegative()) throw new IllegalArgumentException("El tiempo no puede ser negativo");
    }
}

