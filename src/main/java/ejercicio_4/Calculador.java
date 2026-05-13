package ejercicio_4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

    protected LogTransaction log;
    protected int mesEnPromocion;


    public final double calcularPrecio(double precioProducto) {

        validarPrecio(precioProducto);
        
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

    private void validarLog(LogTransaction log) {
        if (log == null) throw new IllegalArgumentException("El log no puede ser nulo");
    }

    private void validarMesEnPromocion(int mesEnPromocion) {
        if (mesEnPromocion < 1 || mesEnPromocion > 12)
            throw new IllegalArgumentException("El mes en promocion debe ser un numero entre 1 y 12");
    }

    private void validarPrecio(double precio) {
        if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
    }
}
