import FeaturesJava10.FeaturesJava10;
import FeaturesJava11.FeaturesJava11;
import FeaturesJava8.FeaturesJava8;
import FeaturesJava9.FeaturesJava9;

public class App {

    public static void main (String args []){
        java8();
        java9();
        java10();
        java11();
    }

    public static void java8() {
        System.out.println("------------------- Java 8 -------------------");
        FeaturesJava8 java8 = new FeaturesJava8();
        java8.listarNomesStream();
        System.out.println("----------------------------------------------");
    }

    public static void java9() {
        System.out.println("------------------- Java 9 -------------------");
        FeaturesJava9 java9 = new FeaturesJava9();
        java9.listaOf();
        System.out.println("----------------------------------------------");
    }

    public static void java10() {
        System.out.println("------------------- Java 10 ------------------");
        var java10 = new FeaturesJava10();
        java10.copiaListaImutavel();
        System.out.println("\n----------------------------------------------");
    }

    public static void java11() {
        System.out.println("------------------- Java 11 ------------------");
        var java11 = new FeaturesJava11();
        java11.calcular();
        java11.arquivos("     Qualquer coisa    ");
        System.out.println("----------------------------------------------");
    }
}
