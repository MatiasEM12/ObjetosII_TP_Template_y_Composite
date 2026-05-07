package ejercicio_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements ItemTrabajo {

    private String nombre;
    private List<ItemTrabajo> items;

    public HistoriaDeUsuario(String nombre) {
        this.nombre = nombre;
        items=new ArrayList<>();

    }

    public void agregar(ItemTrabajo item) {
        items.add(item);
    }

    @Override
    public Duration calcularTiempo() {
        Duration total = Duration.ZERO;

        for(ItemTrabajo t : items) {
            total = total.plus(t.calcularTiempo());
        }

        return total;
    }
}

