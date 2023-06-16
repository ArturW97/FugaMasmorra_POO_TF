public class Lava extends ElementoBasico{
    private ElementoBasico anterior;

    public Lava(String id, String iconPath, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        //super(id, iconPath, linInicial, colInicial, tabuleiro);
        super(id, "chave.png", linInicial, colInicial, tabuleiro);
    }

    public void setAnterior(ElementoBasico anterior){
        this.anterior = anterior;
    }

    @Override
    public void acao(ElementoBasico outro) {
        throw new UnsupportedOperationException("Unimplemented method 'acao'");
    }
}
