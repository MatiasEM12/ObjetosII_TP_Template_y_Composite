package ejercicio_4;

public class CalculadorNoJubilado extends Calculador {


    public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double porcentajeNormal() {
        return 0.21;
    }

    @Override
    protected double porcentajePromocion() {
        return 0.15;
    }
}