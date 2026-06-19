package sistema.entities;

public class LutadorCorpoACorpo extends Personagem {
    private final String arteMarcial;

    public LutadorCorpoACorpo(String nome, int forcaBase, String arteMarcial) {
        super(nome, forcaBase);
        this.arteMarcial = arteMarcial;
    }
    @Override
    public String toString(){
        return ("Nome: "+nome+" | Força Base: "+forcaBase+" | Arte Marcial: "+arteMarcial);
    }
}
