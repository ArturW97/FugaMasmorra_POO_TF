public class Alavanca extends ElementoBasico{
    private boolean estado;
    private int nroPista;
    public static int alavancasAcionadas = 0;


    public Alavanca(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "/Imagens/AlavancaFalse.png", linInicial, colInicial, tabuleiro);
        this.estado = false;
        this.nroPista = nroPista;
    }

    public int getNroPista(){
        return nroPista;
    }

    public void somaAlavanca(){
        alavancasAcionadas++;
    }

    public static int getAlavancasAcionadas(){
        return alavancasAcionadas;
    }
    @Override
    public void acao(ElementoBasico outro) {
        if (!estado){
            estado = true;
            setImage(Tabuleiro.createImageIcon("/Imagens/AlavancaTrue.png"));
            somaAlavanca();
        }
    }    
}
