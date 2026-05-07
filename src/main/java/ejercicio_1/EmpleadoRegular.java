package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRegular extends Empleado{

    public EmpleadoRegular(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    protected List<? extends Empleado> aCargo() {
        return new ArrayList<>();
    }


}
