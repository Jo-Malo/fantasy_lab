import Tools.MeleeWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeleeWeaponTest {
    MeleeWeapon meleeWeapon;

    @Before
    public void before() {
        meleeWeapon = new MeleeWeapon(-1);
    }

    @Test
    public void hasHealthPointManipulator(){
        assertEquals(-1, meleeWeapon.getHealthPointManipulator());
    }
}
