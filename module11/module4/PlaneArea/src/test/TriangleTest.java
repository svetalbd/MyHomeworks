package test;

import com.goitonline.module4.area.Triangle;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 05.04.2016.
 */
public class TriangleTest {
    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Unit-test done!");


    }

    @Test (timeout = 2000)
    public void testAreaOfTriangle() throws Exception {
        final double firstSide = 2;
        final double secondSide = 3;
        final double thirdSide = 3;
        final double perimeter = firstSide + secondSide + thirdSide;
        final double expectedResult = Math.sqrt(perimeter *
                (perimeter - firstSide) * (perimeter - secondSide) * (perimeter - thirdSide));

        final double result = triangle.areaOfTriangle(firstSide, secondSide, thirdSide);

        Assert.assertEquals(expectedResult, result);


    }

}