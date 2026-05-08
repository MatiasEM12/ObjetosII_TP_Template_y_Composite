package ejercicio_3;

import java.lang.classfile.instruction.ThrowInstruction;
import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros implements Paquete {

    private final Double DESCUENTO_ACUMULATIVO=0.05;
    private List<Seguro> seguros= new ArrayList<>();
    private List<Paquete> paquetes=new ArrayList<>();

    public PaqueteSeguros(Seguro seguro) {
        this.seguros.add(seguro);
    }

    public void agregarSeguro(Seguro seguro){
        this.seguros.add(seguro);
    }

    public void agregarPaquete(Paquete paquete){
        paquetes.add(paquete);
    }

    @Override
    public Double subtotalSinDescuento() {

        Double total = 0.0;

        for (Seguro seguro : seguros) {
            total = seguro.sumateA(total);
        }

        for (Paquete paquete : paquetes) {
            total += paquete.subtotalSinDescuento();
        }

        return total;
    }
    @Override
    public Double subtotalSeguros() {

        Double total = subtotalSinDescuento();

        double descuento = cantidadSeguros() * DESCUENTO_ACUMULATIVO;

        return total - (total * descuento);
    }
    @Override
    public int cantidadSeguros() {

        int total = seguros.size();

        for (Paquete paquete : paquetes) {
            total += paquete.cantidadSeguros();
        }

        return total;
    }
}
