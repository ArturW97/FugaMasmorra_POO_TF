public class Pista extends ElementoBasico{
    private boolean fechada;
    private int nroPista;

    public Pista(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "chave.png", linInicial, colInicial, tabuleiro);
        this.fechada = true;
        this.nroPista = nroPista;
    }

    public int getNroPista(){
        return nroPista;
    }

    @Override
    public void acao(ElementoBasico outro) {
        if (fechada){
            fechada = false;
            setImage(Tabuleiro.createImageIcon("fundo.jpg"));
        }else{
            fechada = true;
            setImage(Tabuleiro.createImageIcon("chave.png"));
        }
    }    
}
