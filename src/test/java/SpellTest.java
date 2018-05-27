import Tools.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Spell spell;

    @Before
    public void before() {
        spell = new Spell(1);
    }

    @Test
    public void hasHealthPointManipulator(){
        assertEquals(1, spell.getHealthPointManipulator());
    }
}
