import javax.swing.JOptionPane;

public class Espinhos extends ElementoBasico {

    public Espinhos(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro){
        super(id, "/Imagens/Espinhos.png", linInicial, colInicial, tabuleiro);

    }

    @Override
    public void acao(ElementoBasico outro) {
        JOptionPane.showMessageDialog(getRootPane(), "A planta espinhosa te agarrou. Fim de jogo!");
            System.exit(0);
    }
}
