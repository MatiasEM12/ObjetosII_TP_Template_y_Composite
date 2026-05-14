package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private List<Seguro> seguros = new ArrayList<>();

    public Persona(String nombre, List<Seguro> seguros) {
        validarNombre(nombre);
        validarSeguros(seguros);
        this.nombre = nombre;
        this.seguros = seguros;
    }

    public void agregarSeguro(Seguro seguro) {
        validarSeguro(seguro);
        this.seguros.add(seguro);
    }

    public Double totalSeguros() {
        Double total = 0.0;
        for (Seguro seguro : seguros) {
            total += seguro.subtotalSeguros();
        }
        return total;
    }

    private void validarSeguros(List<Seguro> seguros) {
        if (seguros == null) throw new IllegalArgumentException("La lista de seguros no puede ser nula");
        if (seguros.isEmpty()) throw new IllegalArgumentException("La lista de seguros no puede estar vacía");
    }

    private void validarSeguro(Seguro seguro) {
        if (seguro == null) throw new IllegalArgumentException("El seguro no puede ser nulo");
    }

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }
}
