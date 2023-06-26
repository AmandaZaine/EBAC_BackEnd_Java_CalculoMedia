import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeiraTarefa {

    public void imprimeNomesOrdenados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes separados por virgula (,): ");
        String nomes = scanner.nextLine();

        String[] nomesSeparados = nomes.split(",");

        List<String> nomesEmLista = new ArrayList<>();

        for(String nome : nomesSeparados){
            nomesEmLista.add(nome.trim());
        }

        nomesEmLista.sort(null);

        System.out.println(nomesEmLista);
    }
}
