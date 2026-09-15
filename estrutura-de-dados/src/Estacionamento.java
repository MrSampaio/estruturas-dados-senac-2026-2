import javax.swing.JOptionPane;

public class Estacionamento {

    private String[] placas;
    private int topo;

    public Estacionamento(int capacidade){
        this.placas = new String[capacidade];
        this.topo = -1;
    }

    public boolean estaVazio(){
        return topo == -1;
    }

    public boolean estaCheio(){
        return topo == placas.length - 1;
    }

    public boolean estacionar(String placa){
        if(!estaCheio()){
            topo++;
            this.placas[topo] = placa;

            return true;
        } else{
            JOptionPane.showMessageDialog(null, "O estacionamento está cheio!");
            return false;
        }
    }       

    public String sair(){
        if(estaVazio()){
            JOptionPane.showMessageDialog(null, "O estacionamento está vazio!");
            return null;
        } else{
            String saiu = placas[topo];
            topo--;
            JOptionPane.showMessageDialog(null, "O carro que saiu foi: " + saiu);
            return saiu;
        }
    }

    public String[] exibir(){
        String[] placasDisponiveis = new String[topo + 1];
        for(int i = topo; i >= 0; i--){
            placasDisponiveis[i] = placas[i];
        }

        JOptionPane.showMessageDialog(null, placasDisponiveis);

        return placasDisponiveis;
    }

}
