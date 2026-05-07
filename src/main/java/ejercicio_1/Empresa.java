package ejercicio_1;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Director> directores;

    public Empresa(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
        directores = new ArrayList<>();
    }

    public void agregarDirector(Director director){
        validarDirector(director);
        this.directores.add(director);
    }

    public double  montoTotalSalarial(){
        return 0;
    }

    private void validarNombre(String nombre) {
        if (nombre == null) throw new NullPointerException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
    }
    private void validarDirector(Director director){
        if(director==null)throw new NullPointerException("El director no puede ser nulo");
    }
}
