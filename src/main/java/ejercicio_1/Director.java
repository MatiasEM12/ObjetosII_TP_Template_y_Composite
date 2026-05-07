package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Director extends  Empleado {

    private List<Gerente> gerentes;

    public Director(String nombre, Double salario) {
        super(nombre, salario);
        gerentes= new ArrayList<>();
    }

    public void agregarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }
    @Override
    protected List<? extends Empleado> aCargo() {
        return gerentes;
    }


}
