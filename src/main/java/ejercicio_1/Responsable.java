package ejercicio_1;

import java.util.List;

public class Responsable implements Empleado {

    private String nombre;
    private Double salario;
    private List<Empleado> empleadosACargo;
    private TipoResponsable tipoResponsable;

    public Responsable(String nombre, Double salario, List<Empleado> empleadosACargo, TipoResponsable tipoResponsable) {
        this.nombre = nombre;
        this.salario = salario;
        this.empleadosACargo = empleadosACargo;
        this.tipoResponsable = tipoResponsable;
    }

    public void agregarEmpleadoACargo(Empleado empleado) {
        this.empleadosACargo.add(empleado);
    }

    @Override
    public Double sumateA(Double total) {
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

}
