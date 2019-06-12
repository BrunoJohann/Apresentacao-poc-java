package FeaturesJava11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FeaturesJava11 {

    double n1 = 2.5;
    double n2 = 3.5;
    double n3 = 2;

    //Interface funcional com var
    public void calcular() {
        InterfaceFuncionalJava11 calculadora = (var numero1, var numero2, var numero3 ) -> (numero1 * numero2)/numero3;
        var resultado = calculadora.padraoCalculadora(n1, n2, n3);
        System.out.println("Resultado: " + resultado);
    }

    //writeString, readString e strip
    public void arquivos(String mensagem) {
        mensagem = mensagem.strip();
        try {
            Files.writeString(Path.of("../test.txt"), mensagem);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String texto = null;
        try {
            texto = Files.readString(Path.of("../../test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Conteudo test.txt: " + texto);
    }

}
