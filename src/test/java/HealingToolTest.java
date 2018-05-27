import Tools.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {
    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool(1);
    }

    @Test
    public void hasHealthPointManipulator(){
        assertEquals(1, healingTool.getHealthPointManipulator());
    }
}
