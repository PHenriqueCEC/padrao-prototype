package mundoNinja;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ShinobiTest {

    @Test
    void deveRetornarShinobiOriginalEClone() throws CloneNotSupportedException {
        Shinobi shinobi = new Shinobi("Naruto Uzumaki", "Gennin",  new Atributos  (10, 3, 10) );

        Shinobi shinobiClone = shinobi.clone();
        shinobiClone.setRank("Hokage");
        shinobiClone.getAtributos().setGenjutsu(5);

        assertEquals("Shinobi nome=Naruto Uzumaki, rank=Gennin, atributos= ninjutsu=10, genjutsu=3, taijutsu=10", shinobi.toString());
        assertEquals("Shinobi nome=Naruto Uzumaki, rank=Hokage, atributos= ninjutsu=10, genjutsu=5, taijutsu=10", shinobiClone.toString());


    }
}
