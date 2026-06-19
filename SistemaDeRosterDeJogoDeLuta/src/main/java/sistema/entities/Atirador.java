package sistema.entities;

public class Atirador extends Personagem {
    private String armaPrincipal;

    public Atirador(String nome, int forcaBase,String armaPrincipal){
        super(nome,forcaBase);
        this.armaPrincipal=armaPrincipal;

    }
    @Override
    public String toString(){
        return ("Nome: "+nome+" | Força Base: "+forcaBase+ " Arma Principal: "+armaPrincipal);
    }

}
