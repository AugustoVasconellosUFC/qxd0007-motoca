import static java.lang.System.*;

public class Motoca {

    private int tempo = 0;

    private final int potencia;

    private Pessoa pessoa = null;

    public Motoca(int potencia){
        this.potencia = potencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getTempo() {
        return tempo;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean subir(Pessoa pessoa){
        if(this.pessoa != null)
            return false;
        else {
            this.pessoa = pessoa;
            return true;
        }
    }

    public boolean descer(){
        if(pessoa == null)
            return false;
        else {
            pessoa = null;
            return true;
        }
    }

    public void colocarTempo(int tempo){
        this.tempo += Math.max(0, tempo);
    }

    public boolean dirigir(int tempo){
            if(pessoa != null && pessoa.getIdade() <= 10 && this.tempo > 0 && tempo >= 0) {
                if(tempo > this.tempo)
                    out.println("warning: andou " + (tempo - this.tempo) + " min e acabou o tempo");
                this.tempo = Math.max(0, this.tempo - tempo);
                return true;
            }
            else
                return false;
    }

    public String buzinar(){
        if(pessoa == null)
            return "";
        else {
            StringBuilder s = new StringBuilder("Pm");
            s.insert(1, "e".repeat(Math.max(0, potencia)));
            return s.toString();
        }
    }
}
