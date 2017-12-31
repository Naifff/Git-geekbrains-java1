package ru.geekbrains.java3.dz.dz6.RoumyantsevPA;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestDz {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                { new int[]{1, 7},  new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}},
                { new int[]{},  new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7,4}},
                { new int[]{99, 2, 3, 99, 1, 7},  new int[]{1, 2, 99, 4,99, 2, 3, 99, 1, 7}},
                { new int[]{2, 3, 11, 1, 7},  new int[]{1, 2, 4, 4, 2, 3, 11, 1, 7}},
                { new int[]{1, 2, 3, 22, 1, 7},  new int[]{1, 2, 4, 1, 2, 3, 22, 1, 7}},
                { new int[]{3, 44, 1, 7},  new int[]{1, 2, 4, 4, 4, 3, 44, 1, 7}},
//                { new int[]{99, 2, 3, 99, 1, 7},  new int[]{1, 2, 99,99, 2, 3, 99, 1, 7}},
//                ,                {true, new int[]{1, 2, 3}, new char[]{'q', 'w', 'z'}, 20}
        });
    }

    public TestDz( int[] iArr1, int[] iArr2) {

        this.iArr1 = iArr1;
        this.iArr2 = iArr2;
    }


    private int[] iArr1;
    private int[] iArr2;


    Dz dz;

    @Before
    public void init() {
        dz = new Dz();
    }

    @Test
    public void massTest() {
//        System.out.println(Arrays.toString(iArr1));
//        System.out.println(Arrays.toString(dz.task1(iArr2)));

            Assert.assertEquals(Arrays.toString(iArr1),Arrays.toString(dz.task1(iArr2)));


    }

//        @Test(expected = RuntimeException.class)
//    public void testNo4() {
//        dz.task1(1, 2, 99, 99, 2, 3, 99, 1, 7);
//    }
}
