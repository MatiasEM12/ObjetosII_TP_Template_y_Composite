package ejercicio_5;

public class Comercio {

    public static final double RECARGO_FINAL_IMPORTADO = 0.25;
    public static final double RECARGO_FINAL_NACIONAL = 0.15;
    private String nombre;


    public Comercio(String nombre) {
        this.nombre = nombre;

    }

    public Double calcularPrecioRemeraImportada(RemeraImportada remera) {
        return remera.calcularPrecioDeVenta(RECARGO_FINAL_IMPORTADO);
    }

    public Double calcularPrecioRemeraNacional(RemeraNacional remera) {
        return remera.calcularPrecioDeVenta(RECARGO_FINAL_NACIONAL);
    }
}
