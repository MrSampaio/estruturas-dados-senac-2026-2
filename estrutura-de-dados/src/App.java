public class App {
    public static void main(String[] args) throws Exception {
       
        Estacionamento estacionamento = new Estacionamento(3);

        estacionamento.estacionar("RTX4G82");
        estacionamento.estacionar("MKP9A15");
        estacionamento.estacionar("FWZ0C77");

        estacionamento.exibir();

        estacionamento.sair();


    }
}
