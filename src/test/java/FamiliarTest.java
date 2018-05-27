import Tools.Familiar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamiliarTest {
    Familiar familiar;

    @Before
    public void before() {
        familiar = new Familiar(1);
    }

    @Test
    public void hasHealthPointManipulator(){
        assertEquals(1, familiar.getHealthPointManipulator());
    }
}
