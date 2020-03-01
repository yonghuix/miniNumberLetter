import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ininTest {

    private initService initClass;


    @Before
    public void setup_1() {
            initClass=new initService();
    }
    @Test
    public void  init_test1() {
      assertEquals(0,initClass.getInitList().get(0).keyValue);
      System.out.println("Init test1 pass");
     }

    @Test
    public void  init_test2() {
        List<String> expectList=new ArrayList<>();
        assertEquals(expectList,initClass.getInitList().get(0).charList);
        System.out.println("Init test2 pass");
    }

    @Test
    public void  init_test3() {
        List<String> expectList= Arrays.asList("A","B","C");
        assertEquals(expectList,initClass.getInitList().get(2).charList);
        System.out.println("Init test3 pass");
    }

    @Test
    public void  init_test4() {
        List<String> expectList= Arrays.asList("P","Q","R","S");
        assertEquals(expectList,initClass.getInitList().get(7).charList);
        System.out.println("Init test4 pass");
    }

}
