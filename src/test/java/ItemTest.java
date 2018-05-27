import Tools.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Item item;

    @Before
    public void before() {
        item = new Item(1);
    }

    @Test
    public void hasHealthPointManipulator() {
        assertEquals(1, item.getHealthPointManipulator());
    }

    @Test
    public void canSetHealthPointManipulator() {
        item.setHealthPointManipulator(2);
        assertEquals(2, item.getHealthPointManipulator());
    }
}
