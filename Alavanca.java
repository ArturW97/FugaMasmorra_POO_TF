public class Alavanca extends ElementoBasico{
    private boolean fechada;
    private int nroPista;

    public Alavanca(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "/Imagens/AlavancaFalse.png", linInicial, colInicial, tabuleiro);
        this.fechada = false;
        this.nroPista = nroPista;
    }

    public int getNroPista(){
        return nroPista;
    }

    @Override
    public void acao(ElementoBasico outro) {
        if (fechada){
            fechada = false;
            setImage(Tabuleiro.createImageIcon("/Imagens/AlavancaFalse.png"));
        }else{
            fechada = true;
            setImage(Tabuleiro.createImageIcon("/Imagens/AlavancaTrue.png"));
        }
    }    
}
