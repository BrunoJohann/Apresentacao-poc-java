package FeaturesJava10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FeaturesJava10 {

    // var e List.copyOf
    public void copiaListaImutavel() {
        var lista1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        var lista2 = List.copyOf(lista1);
        System.out.print("Array original: ");
        lista1.add(6);
        lista1.remove(2);
        lista1.forEach((numero)->System.out.print(numero));
        System.out.println("\n\nCópia imutável: ");
        try{
            lista2.add(6);
        }catch (Exception err){
            System.out.println("Lista imutável não pode adicionar");
        }
        try{
            lista2.remove(2);
        }catch (Exception err){
            System.out.println("Lista imutável não pode remover");
        }
        lista2.forEach((numero)->System.out.print(numero));
    }

}
