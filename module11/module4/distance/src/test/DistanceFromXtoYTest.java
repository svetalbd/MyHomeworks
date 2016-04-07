package test;

import com.goitonline.module4.dastanceXY.DistanceFromXtoY;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 05.04.2016.
 */
public class DistanceFromXtoYTest {
    DistanceFromXtoY distanceFromXtoY;

    @Before
    public void setUp() throws Exception {
        distanceFromXtoY = new DistanceFromXtoY();
    }

    @After
    public void tearDown() throws Exception {

        System.out.println("Done!");

    }

    @Test (timeout = 2000)
    public void testDistanceBetweenTwoPoints() throws Exception {
        final double x1 = 10;
        final double x2 = 10;
        final double y1 = 11;
        final double y2 = 11;

        final double expectedResult = Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),1d/2d);

        final double result = distanceFromXtoY.distanceBetweenTwoPoints(x1, x2, y1, y2);

        Assert.assertEquals(expectedResult, result);

    }

}