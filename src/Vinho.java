public class Vinho {
    private char tipo;
    private int ano;

    public Vinho(char tipo, int ano){
        this.tipo = tipo;
        this.ano = ano;
    }

    public char getTipo(){
        return tipo;
    }

    public int getAno(){
        return ano;
    }

    public void setTipo(char tipo){
        this.tipo = tipo;
    }

    public void setAno(){
        this.ano = ano;
    }
}
