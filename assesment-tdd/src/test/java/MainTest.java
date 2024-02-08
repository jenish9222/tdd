import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void test1() {
        Assert.assertEquals(Main.filterInput("1,5").get(0).toString(),"6");
        Assert.assertEquals(Main.filterInput("1\n5").get(0).toString(),"6");
        Assert.assertEquals(Main.filterInput("1,1,5").get(0).toString(),"7");
        Assert.assertEquals(Main.filterInput("1,12,-5").get(0).toString(),"8");
    }

}
