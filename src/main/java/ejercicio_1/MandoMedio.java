package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio extends Empleado{

    List<LiderProyecto> lideresProyecto;

    public  MandoMedio(String nombre, Double salario) {
        super(nombre, salario);
        lideresProyecto=new ArrayList<>();
    }

    public void agregarLiderProyecto(LiderProyecto liderProyecto) {
        lideresProyecto.add(liderProyecto);
    }

    @Override
    protected List<? extends Empleado> aCargo() {
        return lideresProyecto;
    }


}
