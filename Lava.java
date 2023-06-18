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
        JOptionPane.showMessageDialog(getRootPane(), "Você pisou na lava, fim do jogo!");
            System.exit(0);
    }
}
