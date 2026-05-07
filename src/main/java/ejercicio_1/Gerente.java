package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado{

    private List<MandoMedio> mandosMedio;

    public Gerente(String nombre, Double salario) {
        super(nombre, salario);
        mandosMedio=new ArrayList<>();
    }

    public void agregarMandoMedio(MandoMedio mandoMedio) {
        mandosMedio.add(mandoMedio);
    }

    @Override
    protected List<? extends Empleado> aCargo() {
        return mandosMedio;
    }


}
