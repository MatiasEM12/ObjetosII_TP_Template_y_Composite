package ejercicio_1;

import java.util.List;

public class Responsable implements Empleado {

    private String nombre;
    private Double salario;
    private List<Empleado> empleadosACargo;
    private TipoResponsable tipoResponsable;

    public Responsable(String nombre, Double salario, List<Empleado> empleadosACargo, TipoResponsable tipoResponsable) {
        validarNombre(nombre);
        validarSalario(salario);
        validarListadoEmpletados(empleadosACargo);
        validarTipoResponsable(tipoResponsable);
        this.nombre = nombre;
        this.salario = salario;
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

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }

    private void validarSalario(Double salario) {
        if (salario == null) throw new IllegalArgumentException("El salario no puede ser nulo");
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo");
    }

    private void validarTotal(Double total) {
        if (total == null) throw new IllegalArgumentException("El total no puede ser nulo");
        if (total < 0) throw new IllegalArgumentException("El total no puede ser negativo");
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
