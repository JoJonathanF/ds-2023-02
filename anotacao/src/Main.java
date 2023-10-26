public class Main {
    public static void main(String[] args) {
        Observable carro = new Observable("carro");
        Observable casa = new Observable("casa");

        MotoristaObserver motorista = new MotoristaObserver();


        carro.associarObserver(motorista); // Será associado, pois tem o identificador "carro".
        casa.associarObserver(motorista); // Não será associado, pois tem o identificador "casa".

        carro.notificarObservadores(); // Notificará apenas o motorista, que está associado a "carro".
    }
}