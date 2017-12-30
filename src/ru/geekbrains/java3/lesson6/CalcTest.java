import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.*;

public class CalcTest {
    Calculator calculator;

    @Test
    public void test1() {
        Assert.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void test2() {
        Assert.assertEquals(6, calculator.add(3, 3));
    }

    @Test
    public void test3() {
        Assert.assertEquals(8, calculator.add(4, 4));
    }

    @Test
    public void test4() {
        Assert.assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(4, calculator.div(40, 10));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivBy0() {
        calculator.div(10, 0);
    }

    @Test(timeout = 500)
    public void test5() {
//        try {
//            Thread.sleep(501);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(1);
    }

    @Test
    @Ignore("Сейчас мне этот тест не нужен")
    public void test6() {
        System.out.println(6);
    }

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @After
    public void shutdown() {
        System.out.println("End test...");
    }

    @Test
    public void tddTest() {
        Assert.assertEquals(200, calculator.summ(10, 20, 30, 40, 100));
    }
}
