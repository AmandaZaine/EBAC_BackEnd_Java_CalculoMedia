import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegundaTarefa {

    public void separandoPessoasPorSexo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nome e sexo no padrão: Nome-Sexo. Sendo que Sexo pode ser F ou M. Para mais de uma pessoa, separe com virgula (,): ");
        String nomes = scanner.nextLine();

        String[] nomesSeparados = nomes.split(",");

        List<String> mulheres = new ArrayList<>();
        List<String> homens = new ArrayList<>();

        for(String nomeEsexo : nomesSeparados){
            if(nomeEsexo.endsWith("F") || nomeEsexo.endsWith("f")){
                mulheres.add(nomeEsexo);
            }else {
                homens.add(nomeEsexo);
            }
        }

        System.out.println("O grupo de mulheres é: " + mulheres);
        System.out.println("O grupo de homens é: " + homens);

    }
}
