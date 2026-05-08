package ejercicio_1;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaTest {

    @Test
    public void MontoSalarialTest(){
        var director= new Director("Director 1", 15000.0);
        var empresa = new Empresa("Laser X",director);

        var gerente = new Gerente("Gerente 1", 10000.0);
        var mandoMedio = new MandoMedio("Mando Medio 1", 7000.0);
        var liderProyecto = new LiderProyecto("Lider Proyecto 1", 5000.0);
        var empleadoRegular = new EmpleadoRegular("Empleado Regular 1", 3000.0);

        liderProyecto.agregarEmpleadoRegular(empleadoRegular);
        mandoMedio.agregarLiderProyecto(liderProyecto);
        gerente.agregarMandoMedio(mandoMedio);
        director.agregarGerente(gerente);



        Double montoSalarialTotal = empresa.montoTotalSalarial();

        assertEquals(40000.0, montoSalarialTotal, 0.001);

    }
     @Test
    public void ArbolSalarial(){
         var director= new Director("Director 1", 15000.0);
         var empresa = new Empresa("Laser X",director);



         //rama uno

         var gerente1 = new Gerente("Gerente 1", 10000.0);

         var mandoMedio1 = new MandoMedio("Mando Medio 1", 7000.0);
         var mandoMedio2 = new MandoMedio("Mando Medio 2", 7000.0);

         var liderProyecto1 = new LiderProyecto("Lider Proyecto 1", 5000.0);
         var liderProyecto2 = new LiderProyecto("Lider Proyecto 2", 5000.0);

         var empleadoRegular1 = new EmpleadoRegular("Empleado Regular 1", 3000.0);
         var empleadoRegular2= new EmpleadoRegular("Empleado Regular 2", 3000.0);
         var empleadoRegular3 = new EmpleadoRegular("Empleado Regular 3", 3000.0);

         director.agregarGerente(gerente1);

         gerente1.agregarMandoMedio(mandoMedio1);
         gerente1.agregarMandoMedio(mandoMedio2);

         mandoMedio1.agregarLiderProyecto(liderProyecto1);
         mandoMedio2.agregarLiderProyecto(liderProyecto2);

         liderProyecto1.agregarEmpleadoRegular(empleadoRegular1);
         liderProyecto1.agregarEmpleadoRegular(empleadoRegular2);
         liderProyecto2.agregarEmpleadoRegular(empleadoRegular3);

         //rama dos
         var gerente2 = new Gerente("Gerente 1", 10000.0);

         var mandoMedio3= new MandoMedio("Mando Medio 3", 7000.0);
         var mandoMedio4 = new MandoMedio("Mando Medio 4", 7000.0);

         var liderProyecto3 = new LiderProyecto("Lider Proyecto 3", 5000.0);


         var empleadoRegular4 = new EmpleadoRegular("Empleado Regular 4", 3000.0);

         director.agregarGerente(gerente2);

         gerente2.agregarMandoMedio(mandoMedio3);
         gerente2.agregarMandoMedio(mandoMedio4);

         mandoMedio3.agregarLiderProyecto(liderProyecto3);

         liderProyecto3.agregarEmpleadoRegular(empleadoRegular4);


         assertEquals(90000.0, empresa.montoTotalSalarial(), 0.001);
     }

}
