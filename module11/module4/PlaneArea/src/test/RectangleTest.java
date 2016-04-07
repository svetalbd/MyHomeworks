package test;


import com.goitonline.module4.area.Rectangle;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by Сергей on 05.04.2016.
 */
public class RectangleTest {
    Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Unit-test done.");
    }

    @Test (timeout = 2000)
    public void testAreaOfRectangle() throws Exception {
        final double length = 4;
        final double width = 5;
        final double expectedResult =length * width;

        final double result = rectangle.areaOfRectangle(length, width);

        Assert.assertEquals(expectedResult, result);
    }

}