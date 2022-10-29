package mundoNinja;

public class Atributos implements Cloneable {

    private Integer ninjutsu;
    private Integer genjutsu;
    private Integer taijutsu;

    public Atributos(Integer ninjutsu, Integer genjutsu, Integer taijutsu) {
        super();

        this.ninjutsu = ninjutsu;
        this.genjutsu = genjutsu;
        this.taijutsu = taijutsu;
    }

    public Integer getNinjutsu() {
        return ninjutsu;
    }

    public void setNinjutsu(Integer ninjutsu) {
        this.ninjutsu = ninjutsu;
    }

    public Integer getGenjutsu() {
        return genjutsu;
    }

    public void setGenjutsu(Integer genjutsu) {
        this.genjutsu = genjutsu;
    }

    public Integer getTaijutsu() {
        return taijutsu;
    }

    public void setTaijutsu(Integer taijutsu) {
        this.taijutsu = taijutsu;
    }

    public Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }

    public String toString() {
        return
                " ninjutsu=" + ninjutsu + "," +
                        " genjutsu=" + genjutsu + "," +
                        " taijutsu=" + taijutsu ;
    }


}