package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros implements Seguro {

    private final Double DESCUENTO_ACUMULATIVO = 0.05;
    private List<Seguro> seguros = new ArrayList<>();


    public PaqueteSeguros(Seguro seguro) {
        validarSeguro(seguro);
        this.seguros.add(seguro);
    }

    public void agregarSeguro(Seguro seguro) {
        validarSeguro(seguro);
        this.seguros.add(seguro);
    }


    @Override
    public Double subtotalSinDescuento() {

        Double total = 0.0;

        for (Seguro seguro : seguros) {
            total += seguro.subtotalSinDescuento();
        }

        return total;
    }

    @Override
    public Double subtotalSeguros() {

        Double total = subtotalSinDescuento();

        double descuento = cantidadSeguros() * DESCUENTO_ACUMULATIVO;

        return total - (total * descuento);
    }


    public int cantidadSeguros() {

        int total = 0;

        for (Seguro seguro : seguros) {
            total += seguro.cantidadSeguros();
        }

        return total;
    }

    private void validarSeguro(Seguro seguro) {
        if (seguro == null) throw new IllegalArgumentException("El seguro no puede ser nulo");
    }
}
