

public class Personagem extends ElementoBasico {
    private ElementoBasico anterior;

    public Personagem(String id, String iconPath, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, iconPath, linInicial, colInicial, tabuleiro);
    }

    public void setAnterior(ElementoBasico anterior){
        this.anterior = anterior;
    }
    
    public void moveDireita() {
        // Remove o Personagem da posicao atual e avança
        Lava lava = new Lava("id", "Imagens/Lava.png", anterior.getLin(), anterior.getCol(), getTabuleiro());
        getTabuleiro().insereElemento(lava);
        this.incCol();
        // Verifica se tem algum elemento de interesse na nova posicao
        // e interage de acordo
        ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
        if (!(elemento instanceof Fundo)) {
            elemento.acao(this);
            this.decCol();
            this.anterior = getTabuleiro().insereElemento(this);
        } else {
            this.anterior = getTabuleiro().insereElemento(this);
        }
    }

    public void moveEsquerda() {
        // Remove o Personagem da posicao atual e avança
        Lava lava = new Lava("id", "Imagens/Lava.png", anterior.getLin(), anterior.getCol(), getTabuleiro());
        getTabuleiro().insereElemento(lava);
        this.decCol();
        // Verifica se tem algum elemento de interesse na nova posicao
        // e interage de acordo
        ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
        if (!(elemento instanceof Fundo)) {
            elemento.acao(this);
            this.incCol();
            this.anterior = getTabuleiro().insereElemento(this);
        } else {
            this.anterior = getTabuleiro().insereElemento(this);
        }
    }

    public void moveCima() {
        // Remove o Personagem da posicao atual e avança
        Lava lava = new Lava("id", "Imagens/Lava.png", anterior.getLin(), anterior.getCol(), getTabuleiro());
        getTabuleiro().insereElemento(lava);        
        this.decLin();
        // Verifica se tem algum elemento de interesse na nova posicao
        // e interage de acordo
        ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
        if (!(elemento instanceof Fundo)) {
            elemento.acao(this);
            this.incLin();
            this.anterior = getTabuleiro().insereElemento(this);
        } else {
            this.anterior = getTabuleiro().insereElemento(this);
        }
    }

    public void moveBaixo() {
        // Remove o Personagem da posicao atual e avança
        Lava lava = new Lava("id", "Imagens/Lava.png", anterior.getLin(), anterior.getCol(), getTabuleiro());
        getTabuleiro().insereElemento(lava);
        this.incLin();
        // Verifica se tem algum elemento de interesse na nova posicao
        // e interage de acordo
        ElementoBasico elemento = getTabuleiro().getElementoNaPosicao(this.getLin(), this.getCol());
        if (!(elemento instanceof Fundo)) {
            elemento.acao(this);
            this.decLin();
            this.anterior = getTabuleiro().insereElemento(this);
        } else {
            this.anterior = getTabuleiro().insereElemento(this);
        }
    }

    @Override
    public void acao(ElementoBasico outro) {
        throw new UnsupportedOperationException("Unimplemented method 'acao'");
    }
}
