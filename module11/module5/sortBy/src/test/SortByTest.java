package test;

import com.goit.module5.sorting.SortBy;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


/**
 * Created by Сергей on 06.04.2016.
 */
@RunWith(value = Parameterized.class)
public class SortByTest {
    private final SortBy sortBy = new SortBy();
    private int[] array;
    private int[] sortedArray;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 9}, new int[]{1, 2, 3, 4, 5, 9}},
                {new int[]{3, 4, 5, 6, 1, 0}, new int[]{0, 1, 3, 4, 5, 6}},
                {new int[]{-1, 2, 8, -2, 6, 1},new int[]{-2, -1, 1, 2, 6, 8}}
        });

    }

    public SortByTest(int[] array, int[] sortedArray) {
        this.array = array;
        this.sortedArray = sortedArray;
    }

    @Test
    public void testSortArray() throws Exception {
        assertArrayEquals(sortedArray, sortBy.sortArray(array));
    }

}