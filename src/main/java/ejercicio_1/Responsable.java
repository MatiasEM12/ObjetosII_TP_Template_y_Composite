package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Responsable extends Empleado {


    private List<Empleado> empleadosACargo = new ArrayList<>();
    private TipoResponsable tipoResponsable;

    public Responsable(String nombre, Double salario, List<Empleado> empleadosACargo, TipoResponsable tipoResponsable) {

        super(nombre, salario);
        validarListadoEmpletados(empleadosACargo);
        validarTipoResponsable(tipoResponsable);

        this.empleadosACargo = empleadosACargo;
        this.tipoResponsable = tipoResponsable;
    }

    public void agregarEmpleadoACargo(Empleado empleado) {
        validarEmpleado(empleado);
        this.empleadosACargo.add(empleado);
    }

    @Override
    public Double sumateA(Double total) {
        validarTotal(total);
        return total + this.salario;
    }

    @Override
    public Double SalarioTotal() {
        Double total = 0.0;
        total = this.sumateA(total);
        for (Empleado empleado : empleadosACargo) {
            total += empleado.SalarioTotal();
        }
        return total;
    }


    private void validarEmpleado(Empleado empleado) {
        if (empleado == null) throw new IllegalArgumentException("El empleado no puede ser nulo");
    }

    private void validarTipoResponsable(TipoResponsable tipoResponsable) {
        if (tipoResponsable == null) throw new IllegalArgumentException("El tipo de responsable no puede ser nulo");
    }

    private void validarListadoEmpletados(List<Empleado> empleadosACargo) {
        if (empleadosACargo == null)
            throw new IllegalArgumentException("El listado de empleados a cargo no puede ser nulo");
    }

}
