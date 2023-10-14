import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Observado {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(Observador observadorNotificado) {
        for (Observador observador : observadores) {
            if (observador != observadorNotificado) {
                System.out.println("Reavaliar " + observador.getNome() + " por mudança ocorrida em " + observadorNotificado.getNome());
                observador.reavaliar();
            }
        }
    }


    public List<Observador> getObservadores() {
        return observadores;
    }
}