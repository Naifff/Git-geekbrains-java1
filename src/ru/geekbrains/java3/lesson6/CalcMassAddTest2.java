
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalcMassAddTest2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {false, new int[]{1, 2, 3}, new char[]{'a', 'b'}, 10},
                {true, new int[]{1, 2, 3}, new char[]{'q', 'w', 'z'}, 20}
        });
    }

    public CalcMassAddTest2(boolean booleanField, int[] iArr, char[] cArr, int intField) {
        this.booleanField = booleanField;
        this.iArr = iArr;
        this.cArr = cArr;
        this.intField = intField;
    }

    private boolean booleanField;
    private int[] iArr;
    private char[] cArr;
    private int intField;

    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void massTestAdd() {
        System.out.println(booleanField);
        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(cArr));
        System.out.println(intField);
        Assert.assertTrue(true);
    }
}