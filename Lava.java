import javax.swing.JOptionPane;

public class Lava extends ElementoBasico{
    private ElementoBasico anterior;

    public Lava(String id, String iconPath, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "Imagens/Lava.png", linInicial, colInicial, tabuleiro);
    }

    public void setAnterior(ElementoBasico anterior){
        this.anterior = anterior;
    }

    @Override
    public void acao(ElementoBasico outro) {
        if (Personagem.getEscorregadas() == 0) {
            Personagem.setEscorregadas();
            JOptionPane.showMessageDialog(getRootPane(), "Cuidado! Você quase caiu na lava.");
            return;
        }
        else {
            JOptionPane.showMessageDialog(getRootPane(), "Você caiu na lava. Fim de jogo!");
            System.exit(0);
        }
    }
}
