package mundoNinja;

public class Shinobi implements Cloneable {

    private String nome;
    private String rank;
    private Atributos atributos;

    public Shinobi(String nome, String rank, Atributos atributos) {
        this.nome = nome;
        this.rank = rank;
        this.atributos = atributos;

    }

    public String getNome() {
        return nome;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Shinobi clone() throws CloneNotSupportedException{
        Shinobi shinobiClone = (Shinobi) super.clone();
        shinobiClone.atributos = (Atributos) shinobiClone.atributos.clone();
        return shinobiClone;
    }

    public String toString() {
        return
                "Shinobi nome=" + nome +
                        ", rank='" + rank + "'"+
                        ", atributos=" + atributos;
    }


}
