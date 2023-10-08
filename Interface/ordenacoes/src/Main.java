import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();
        // Preencha a lista de estudantes com dados

        // Ordenar por nome
        Ordenacao.ordenarPorNome(estudantes);

        // Ordenar por sobrenome
        Ordenacao.ordenarPorSobrenome(estudantes);

        // Ordenar por idade
        Ordenacao.ordenarPorIdade(estudantes);

        // Ordenar por nota (índice 0, primeira nota)
        Ordenacao.ordenarPorNota(estudantes, 0);

        // Ordenar por média
        Ordenacao.ordenarPorMedia(estudantes);
    }
}