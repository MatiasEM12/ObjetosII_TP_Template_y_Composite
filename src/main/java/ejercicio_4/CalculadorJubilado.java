package ejercicio_4;

public class CalculadorJubilado extends Calculador {

    public CalculadorJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double porcentajeNormal() {
        return 0.0;
    }

    @Override
    protected double porcentajePromocion() {
        return 0.1;
    }
}
