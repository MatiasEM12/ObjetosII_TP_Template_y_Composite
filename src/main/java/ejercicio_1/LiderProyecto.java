package ejercicio_1;

import java.util.List;

public class LiderProyecto extends Empleado{

    private List<EmpleadoRegular> empleadosRegulares;

    public  LiderProyecto(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    public Double SalarioTotal() {
        return 0.0;
    }
}
