package sistema.entities;

public abstract class Personagem {
    protected String nome;
    protected int forcaBase;

    public Personagem(String nome, int forcaBase){
        this.nome=nome;
        this.forcaBase=forcaBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForcaBase() {
        return forcaBase;
    }

    public void setForcaBase(int forcaBase) {
        this.forcaBase = forcaBase;
    }
    public String toString(){
        return ("Nome: "+nome+" | Força Base: "+forcaBase);
    }
}
