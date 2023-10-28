//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Observable carro = new Observable("carro");
        Observable casa = new Observable("casa");
        MotoristaObserver motorista = new MotoristaObserver();
        carro.associarObserver(motorista);
        casa.associarObserver(motorista);
        carro.notificarObservadores();
    }
}
