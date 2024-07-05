import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final var lista = Arrays.asList("Adriana", "Rodrigo", "Jimena", "Ligia", "Nayelli",
                "Nayigia", "Liyell", "Nora", "Norma", "Laura");

        final var listaFiltrada = new ArrayList<String>();
        for (var elemento : lista) {
            if (elemento.startsWith("L")) {

                listaFiltrada.add(elemento);
            }
        }
        System.out.printf("La lista filtrada es: %s%n", listaFiltrada);
    }
}

