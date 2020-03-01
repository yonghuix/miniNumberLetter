import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class combinationTest {

    private combinationService combinationClass;
    @Before
    public void setup_1() {
        combinationClass=new combinationService();
    }

    @Test
    public void  combination_test1() {
        List<String> expectList= Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        List<String> inputList1= Arrays.asList("A","B","C");
        List<String> inputList2= Arrays.asList("D","E","F");
        assertEquals(expectList,combinationClass.getCombination(inputList1,inputList2));
        System.out.println("combination test1 pass");

    }

    @Test
    public void  combination_test2() {
        List<String> expectList= Arrays.asList("D","E","F");
        List<String> inputList1= Arrays.asList();
        List<String> inputList2= Arrays.asList("D","E","F");
        assertEquals(expectList,combinationClass.getCombination(inputList1,inputList2));
        System.out.println("combination test2 pass");

    }

}
