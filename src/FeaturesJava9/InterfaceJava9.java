package FeaturesJava9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface InterfaceJava9 {

    //Interface com metodo privado
    private ArrayList<String> listaArray() { return new ArrayList<String>(Arrays.asList("Bruno", "Gaba", "Michele")); };

    //Java 8
    default ArrayList<String> pegarLista() {
        return this.listaArray();
    }

}
