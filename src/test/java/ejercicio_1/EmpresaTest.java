package ejercicio_1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaTest {

    @Test
    public void MontoSalarialTest() {
        var director = new Responsable("Director 1", 15000.0, new ArrayList<>(), TipoResponsable.DIRECTOR);
        var empresa = new Empresa("Laser X", director);

        var gerente = new Responsable("Gerente 1", 10000.0, new ArrayList<>(), TipoResponsable.GERENTE);
        var mandoMedio = new Responsable("Mando Medio 1", 7000.0, new ArrayList<>(), TipoResponsable.MANDOMEDIO);
        var liderProyecto = new Responsable("Lider Proyecto 1", 5000.0, new ArrayList<>(), TipoResponsable.LIDERPROYECTO);
        var empleadoRegular = new Regular("Empleado Regular 1", 3000.0);

        liderProyecto.agregarEmpleadoACargo(empleadoRegular);
        mandoMedio.agregarEmpleadoACargo(liderProyecto);
        gerente.agregarEmpleadoACargo(mandoMedio);
        director.agregarEmpleadoACargo(gerente);


        assertEquals(40000.0, empresa.montoTotalSalarial(), 0.001);

    }

    @Test
    public void ArbolSalarial() {
        var director = new Responsable("Director 1", 15000.0, new ArrayList<>(), TipoResponsable.DIRECTOR);
        var empresa = new Empresa("Laser X", director);


        //rama uno

        var gerente1 = new Responsable("Gerente 1", 10000.0, new ArrayList<>(), TipoResponsable.GERENTE);

        var mandoMedio1 = new Responsable("Mando Medio 1", 7000.0, new ArrayList<>(), TipoResponsable.MANDOMEDIO);
        var mandoMedio2 = new Responsable("Mando Medio 2", 7000.0, new ArrayList<>(), TipoResponsable.MANDOMEDIO);

        var liderProyecto1 = new Responsable("Lider Proyecto 1", 5000.0, new ArrayList<>(), TipoResponsable.LIDERPROYECTO);
        var liderProyecto2 = new Responsable("Lider Proyecto 2", 5000.0, new ArrayList<>(), TipoResponsable.LIDERPROYECTO);

        var empleadoRegular1 = new Regular("Empleado Regular 1", 3000.0);
        var empleadoRegular2 = new Regular("Empleado Regular 2", 3000.0);
        var empleadoRegular3 = new Regular("Empleado Regular 3", 3000.0);

        director.agregarEmpleadoACargo(gerente1);

        gerente1.agregarEmpleadoACargo(mandoMedio1);
        gerente1.agregarEmpleadoACargo(mandoMedio2);

        mandoMedio1.agregarEmpleadoACargo(liderProyecto1);
        mandoMedio2.agregarEmpleadoACargo(liderProyecto2);

        liderProyecto1.agregarEmpleadoACargo(empleadoRegular1);
        liderProyecto1.agregarEmpleadoACargo(empleadoRegular2);
        liderProyecto2.agregarEmpleadoACargo(empleadoRegular3);

        //rama dos
        var gerente2 = new Responsable("Gerente 1", 10000.0, new ArrayList<>(), TipoResponsable.GERENTE);

        var mandoMedio3 = new Responsable("Mando Medio 3", 7000.0, new ArrayList<>(), TipoResponsable.MANDOMEDIO);
        var mandoMedio4 = new Responsable("Mando Medio 4", 7000.0, new ArrayList<>(), TipoResponsable.MANDOMEDIO);

        var liderProyecto3 = new Responsable("Lider Proyecto 3", 5000.0, new ArrayList<>(), TipoResponsable.LIDERPROYECTO);


        var empleadoRegular4 = new Regular("Empleado Regular 4", 3000.0);

        director.agregarEmpleadoACargo(gerente2);

        gerente2.agregarEmpleadoACargo(mandoMedio3);
        gerente2.agregarEmpleadoACargo(mandoMedio4);

        mandoMedio3.agregarEmpleadoACargo(liderProyecto3);

        liderProyecto3.agregarEmpleadoACargo(empleadoRegular4);


        assertEquals(90000.0, empresa.montoTotalSalarial(), 0.001);
    }

}
