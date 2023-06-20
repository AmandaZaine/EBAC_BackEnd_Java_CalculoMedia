public class CalculaMediaNotas {

    public String calcularMediaNotas(int nota1, int nota2, int nota3, int nota4){
        int media = (nota1 + nota2 + nota3 + nota4)/4;
        String statusAluno;

        if (media >= 7) {
            statusAluno = "Aprovado";
        } else if (media >= 5) {
            statusAluno = "Em recuperacao";
        } else {
            statusAluno = "Reprovado";
        }
        return statusAluno;
    }
}
