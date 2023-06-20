import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculaMediaNotas calculaMediaNotas = new CalculaMediaNotas();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        System.out.println("Digite a quarta nota: ");
        int nota4 = scanner.nextInt();

        String mediaNotas = calculaMediaNotas.calcularMediaNotas(nota1, nota2, nota3, nota4);
        System.out.printf("O Aluno está " + mediaNotas);
    }
}