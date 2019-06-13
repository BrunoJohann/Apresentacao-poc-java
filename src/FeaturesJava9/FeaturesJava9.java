package FeaturesJava9;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
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

    //Http
    public void http() {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req =
                HttpRequest.newBuilder(URI.create("http://api-int.grupodimedservices.com.br/tst/item/v3/itens/base/autocomplete?nome=torsilax_30&codigoFilial=101&maxResult=200&ordenarRentabilidade=true&ordenarPreco=false"))
                        .header("app-token", "mCl6SnTQp6eT")
                        .header("User-Agent","Java")
                        .GET()
                        .build();

        try {
            HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println(req.headers());
            System.out.println("Resposta: " + resp.body());
        } catch (Exception err) {
            System.out.println("Erro na requisição");
        }

    }

}
