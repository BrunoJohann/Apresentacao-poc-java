package FeaturesJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FeaturesJava8 {

    //Stream e lambda
    public void listarNomesStream() {
        List<String> nomes = new ArrayList<>(Arrays.asList("Bruno", "Gaba", "Michele", "Harry"));
        nomes.add("Beto");
        nomes.stream()
                .sorted(Comparator.comparingInt(String::length))
                .filter(nome -> nome.length() < 6)
                .forEach(System.out::println);
    }

}
