package ejercicio_4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

    protected LogTransaction log;
    protected int mesEnPromocion;


    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * porcentajePromocion();
        } else {
            precioTotal += precioProducto * porcentajeNormal();
        }
        log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }

    protected abstract double porcentajeNormal();

    protected abstract double porcentajePromocion();

    ;
}
