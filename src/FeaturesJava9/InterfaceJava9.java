package FeaturesJava9;

import java.util.List;

public interface InterfaceJava9 {

    //Interface com metodo privado e List.of
    private List<String> lista() {
        return List.of("Bruno", "Gaba", "Michele");
    };

    default List<String> pegarLista() {
        return lista();
    }

}
