package FeaturesJava9;

import java.util.List;

public class FeaturesJava9 implements InterfaceJava9 {

    public void listaOf() {
        List<String> nomes = this.pegarLista();
        try {
            nomes.add("Fulaninho");
        } catch (Exception err) {
            System.out.println(new Exception("Lista imutável não pode adicionar um novo elemento"));
        }
        try {
            nomes.remove(1);
        } catch (Exception err) {
            System.out.println(new Exception("Lista imutável não pode excluir um elemento"));
        }
        nomes.forEach(nome -> System.out.println(nome));
    }

}
