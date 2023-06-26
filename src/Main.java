import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrimeiraTarefa primeiraTarefa = new PrimeiraTarefa();
        primeiraTarefa.imprimeNomesOrdenados();

        SegundaTarefa segundaTarefa = new SegundaTarefa();
        segundaTarefa.separandoPessoasPorSexo();
    }
}