package FeaturesJava10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FeaturesJava10 {

    // var e .copyOf
    public void listaCopyOf() {
        var nomes = new ArrayList<String>(Arrays.asList("Bruno","Gabriel"));
        var listCopyOf = List.copyOf(nomes);
        nomes.add("Jorge");
        try{
            listCopyOf.add("Teste");
        }catch (Exception err){
            System.out.println("Lista imutável não pode adicionar");
        }
        try{
            listCopyOf.remove(2);
        }catch (Exception err){
            System.out.println("Lista imutável não pode remover");
        }
        listCopyOf.forEach(nome -> System.out.println(nome));
    }

}
