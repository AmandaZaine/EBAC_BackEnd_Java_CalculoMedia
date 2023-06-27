import java.util.*;

public class SegundaTarefa {

    public void separandoPessoasPorSexo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nome e sexo no padrão: Nome-Sexo. Sendo que Sexo pode ser F ou M. Para mais de uma pessoa, separe com virgula (,): ");
        String nomes = scanner.nextLine();

        String[] nomesSeparados = nomes.split(",");

        Map<String, String> mulheres = new HashMap<>();
        Map<String, String> homens = new HashMap<>();


        for(String nomeEsexo : nomesSeparados){
            if(nomeEsexo.endsWith("F") || nomeEsexo.endsWith("f")){
                mulheres.put(nomeEsexo.split("-")[0], "Mulher");
            } else {
                homens.put(nomeEsexo.split("-")[0], "Homem");
            }
        }

        System.out.println("O grupo de mulheres é: ");
        mulheres.forEach((key, value) -> System.out.println(key + " é uma " + value));
        System.out.println("O grupo de homens é: ");
        homens.forEach((key, value) -> System.out.println(key + " é um " + value));

    }
}
