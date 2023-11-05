import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final static double EPS = 1e-9;
    private static Vector2D vector;

    @BeforeClass
    public static void createVector2D(){
        vector = new Vector2D();
    }
    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0, vector.length(),EPS);
    }
}
