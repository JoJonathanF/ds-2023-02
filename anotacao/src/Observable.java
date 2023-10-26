public class Observable {
    private String identificador;

    public Observable(String identificador) {
        this.identificador = identificador;
    }

    public void associarObserver(Object observer) {
        Class<?> observerClass = observer.getClass();

        if (observerClass.isAnnotationPresent(Observer.class)) {
            Observer annotation = observerClass.getAnnotation(Observer.class);

            if (annotation.observado().equals(identificador)) {
                System.out.println("Associando Observer a " + identificador);
                // Lógica para adicionar o Observer ao objeto Observable.
            }
        }
    }

    public void notificarObservadores() {
        // Lógica para notificar os Observers associados a este Observable.
    }
}

