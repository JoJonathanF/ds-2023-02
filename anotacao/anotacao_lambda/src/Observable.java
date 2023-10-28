//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private String identificador;
    private List<Observador> observers = new ArrayList<>();


    public Observable(String identificador) {
        this.identificador = identificador;
    }

    public void associarObserver(Object observer) {
        if (observer.getClass().isAnnotationPresent(Observer.class)) {
            Observer annotation = observer.getClass().getAnnotation(Observer.class);
            if (annotation.observado().equals(identificador)) {
                observers.add(() -> {
                    // Lógica a ser executada quando o evento é observado.
                    System.out.println("Evento observado por " + observer.getClass().getSimpleName());
                });
            }
        }
    }

    public void notificarObservadores() {
    }
}
