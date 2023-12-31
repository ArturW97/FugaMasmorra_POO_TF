import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener{
    private Tabuleiro tabuleiro;
    private Personagem personagem;

    public App() {
        super();
        // Define os componentes da tela
        tabuleiro = new Tabuleiro();
        
        JPanel botoesDirecao = new JPanel(new FlowLayout());
        JButton butDir = new JButton("Direita");
        butDir.addActionListener(this);
        JButton butEsq = new JButton("Esquerda");
        butEsq.addActionListener(this);
        JButton butCima = new JButton("Acima");
        butCima.addActionListener(this);
        JButton butBaixo = new JButton("Abaixo");
        butBaixo.addActionListener(this);
        
        botoesDirecao.add(butEsq);
        botoesDirecao.add(butDir);
        botoesDirecao.add(butCima);
        botoesDirecao.add(butBaixo);
        
        JPanel painelGeral = new JPanel();
        painelGeral.setLayout(new BoxLayout(painelGeral, BoxLayout.PAGE_AXIS));
        ScrollPane sp = new ScrollPane();
        sp.add(tabuleiro);
        painelGeral.add(sp);
        
        painelGeral.add(sp);
        painelGeral.add(botoesDirecao);
        // Insere os personagens no tabuleiro
        personagem = new Personagem("Feliz","Imagens/Personagem.png",2,0,tabuleiro);
        ElementoBasico anterior = tabuleiro.insereElemento(personagem);
        personagem.setAnterior(anterior);

        Alavanca Alavanca1 = new Alavanca("Alavanca1",22,0,0,tabuleiro);
        tabuleiro.insereElemento(Alavanca1);
        Alavanca Alavanca2 = new Alavanca("Alavanca2",15,5,1,tabuleiro);
        tabuleiro.insereElemento(Alavanca2);
        Alavanca Alavanca3 = new Alavanca("Alavanca3",22,2,5,tabuleiro);
        tabuleiro.insereElemento(Alavanca3);
        Alavanca Alavanca4 = new Alavanca("Alavanca4",15,1,7,tabuleiro);
        tabuleiro.insereElemento(Alavanca4);
        Alavanca Alavanca5 = new Alavanca("Alavanca5",5,5, 11,tabuleiro);
        tabuleiro.insereElemento(Alavanca5);

        Espinhos espinhos1 = new Espinhos("espinhos1", 0, 1, 0, tabuleiro);
        tabuleiro.insereElemento(espinhos1);
        Espinhos espinhos2 = new Espinhos("espinhos2", 0, 2, 2, tabuleiro);
        tabuleiro.insereElemento(espinhos2);
        Espinhos espinhos3 = new Espinhos("espinhos3", 0, 3, 2, tabuleiro);
        tabuleiro.insereElemento(espinhos3);
        Espinhos espinhos4 = new Espinhos("espinhos4", 0, 1, 4, tabuleiro);
        tabuleiro.insereElemento(espinhos4);
        Espinhos espinhos5 = new Espinhos("espinhos5", 0, 2, 4, tabuleiro);
        tabuleiro.insereElemento(espinhos5);
        Espinhos espinhos6 = new Espinhos("espinhos6", 0, 4, 4, tabuleiro);
        tabuleiro.insereElemento(espinhos6);
        Espinhos espinhos7 = new Espinhos("espinhos7", 0, 0,6, tabuleiro);
        tabuleiro.insereElemento(espinhos7);
        Espinhos espinhos8 = new Espinhos("espinhos8", 0, 1,6, tabuleiro);
        tabuleiro.insereElemento(espinhos8);
        Espinhos espinhos9 = new Espinhos("espinhos9", 0, 3, 7, tabuleiro);
        tabuleiro.insereElemento(espinhos9);
        Espinhos espinhos10 = new Espinhos("espinhos10", 0, 4, 8, tabuleiro);
        tabuleiro.insereElemento(espinhos10);
        Espinhos espinhos11 = new Espinhos("espinhos11", 0, 4, 9, tabuleiro);
        tabuleiro.insereElemento(espinhos11);
        Espinhos espinhos12 = new Espinhos("espinhos12", 0, 2, 11, tabuleiro);
        tabuleiro.insereElemento(espinhos12);

        Porta porta = new Porta("Porta1",2215,1,11,tabuleiro);
        tabuleiro.insereElemento(porta);

        // Exibe a janela
        this.add(painelGeral);

        this.setSize(1100,1100);
        this.setTitle("Fuga da Masmorra");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        tabuleiro.atualizaVisualizacao();
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        JButton but = (JButton)arg0.getSource();
        if (but.getText().equals("Direita")){
            personagem.moveDireita();
        }
        if (but.getText().equals("Esquerda")){
            personagem.moveEsquerda();
        }
        if (but.getText().equals("Acima")){
            personagem.moveCima();
        }
        if (but.getText().equals("Abaixo")){
            personagem.moveBaixo();
        }
        tabuleiro.atualizaVisualizacao();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}