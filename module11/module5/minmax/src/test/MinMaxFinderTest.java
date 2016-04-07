package test;

import com.goitonline.module5.minmax.MinMaxFinder;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.*;


/**
 * Created by Сергей on 06.04.2016.
 */
@RunWith(value = Parameterized.class)
public class MinMaxFinderTest {
    private final MinMaxFinder minMaxFinder = new MinMaxFinder();
    private int numberMin;
    private int numberMax;
    private int[] array;

    public MinMaxFinderTest(int[] array, int numberMin, int numberMax) {
        this.array =  array;
        this.numberMin = numberMin;
        this.numberMax = numberMax;
    }

    @Parameterized.Parameters (name = "{index} = min and max value of array")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {new int[]{1, 2, 3, 4, 5}, 1, 5},
                {new int[]{3, 4, 5, 6, 1}, 1, 6},
                {new int[]{2, 8, -2, 6, 1}, -2, 8}
        });
    }


    @Test ()
    public void findMinValue() throws Exception {
        assertEquals(numberMin, minMaxFinder.findMinValue(array));

    }

    @Test
    public void findMaxValue() throws Exception {
        assertEquals(numberMax, minMaxFinder.findMaxValue(array));

    }

}