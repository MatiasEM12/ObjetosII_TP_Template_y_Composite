package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class LiderProyecto extends Empleado {

    private List<EmpleadoRegular> empleadosRegulares;

    public LiderProyecto(String nombre, Double salario) {
        super(nombre, salario);
        empleadosRegulares= new ArrayList<>();
    }

    public void agregarEmpleadoRegular(EmpleadoRegular empleadoRegular) {
        empleadosRegulares.add(empleadoRegular);
    }

    @Override
    protected List<? extends Empleado> aCargo() {
        return empleadosRegulares;
    }

}
