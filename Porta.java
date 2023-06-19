
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
            JOptionPane.showMessageDialog(getRootPane(), "Parabéns, você conseguiu escapar da masmorra!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(getRootPane(), "As alavancas não foram acionadas e a porta foi trancada. Você perdeu!");
            System.exit(0);
        }
    }
}
