package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> directores = new ArrayList<>();
    ;

    public Empresa(String nombre, Empleado director) {
        validarNombre(nombre);
        validarDirector(director);
        this.nombre = nombre;
        directores.add(director);
    }

    public void agregarDirector(Empleado director) {
        validarDirector(director);
        this.directores.add(director);
    }

    public Double montoTotalSalarial() {
        Double salario = 0.0;
        for (Empleado director : directores) {
            salario += director.SalarioTotal();
        }
        return salario;
    }

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }

    private void validarDirector(Empleado director) {
        if (director == null) throw new NullPointerException("El director no puede ser nulo");

    }
}