
public class Main {
    public static void main(String[] args) {

        CalculaMediaNotas calculaMediaNotas = new CalculaMediaNotas();
        double mediaNotas = calculaMediaNotas.calcularMediaNotas(5.0, 4.0, 8.0, 7.0);
        System.out.printf("A media de notas é " + mediaNotas);
    }
}