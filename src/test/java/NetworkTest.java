import org.junit.Test;

public class NetworkTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThenOneSecond(){
        Network.getConection();
    }
}
