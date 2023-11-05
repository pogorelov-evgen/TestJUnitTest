import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector2D v = new Vector2D();

        Assert.assertEquals(0, v.length(),1e-9);
    }
}
