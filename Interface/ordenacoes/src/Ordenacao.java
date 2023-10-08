import java.util.Comparator;
import java.util.List;

public class Ordenacao {
    public static void ordenarPorNome(List<Estudante> estudantes) {
        estudantes.sort(Comparator.comparing(Estudante::getNome));
    }

    public static void ordenarPorSobrenome(List<Estudante> estudantes) {
        estudantes.sort(Comparator.comparing(Estudante::getSobrenome));
    }

    public static void ordenarPorIdade(List<Estudante> estudantes) {
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
    }

    public static void ordenarPorNota(List<Estudante> estudantes, int indiceNota) {
        estudantes.sort(Comparator.comparingDouble(estudante -> estudante.getNotas()[indiceNota]));
    }

    public static void ordenarPorMedia(List<Estudante> estudantes) {
        estudantes.sort(Comparator.comparingDouble(Estudante::getMedia));
    }
}
