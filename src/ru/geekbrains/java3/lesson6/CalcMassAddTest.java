
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class CalcMassAddTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
//        List<Object[]> list = new ArrayList<Object[]>();
//        for (int i = 0; i < 2000; i++) {
//            list.add(new Object[] {i, i, i * 2});
//        }
//        return list;
        return Arrays.asList(new Object[][]{
                {0, 0, 0},
                {1, 1, 2},
                {2, 2, 4},
                {4, 5, 10},
                {4, 1, 6},
                {1, 3, 4},
                {6, -2, 4},
                {-2, 5, 4}
        });
    }

    private int a;
    private int b;
    private int c;

    public CalcMassAddTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void massTestAdd() {
        Assert.assertEquals(c, calculator.add(a, b));
    }
}