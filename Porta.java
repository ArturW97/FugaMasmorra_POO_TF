
import javax.swing.JOptionPane;

public class Porta extends ElementoBasico {
    private int nroPista;

    public Porta(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "Imagens/Porta.png", linInicial, colInicial, tabuleiro);
        this.nroPista = nroPista;
    }

    public int getNroPista() {
        return nroPista;
    }

    @Override
    public void acao(ElementoBasico outro) {
        int num = Alavanca.getAlavancasAcionadas();
        if (num == 5) {
            JOptionPane.showMessageDialog(getRootPane(), "Parabéns, você ganhou!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(getRootPane(), "Você perdeu!");
            System.exit(0);
        }
    }
}
