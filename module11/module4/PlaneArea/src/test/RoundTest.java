package test;

import com.goitonline.module4.area.Round;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Сергей on 05.04.2016.
 */
public class RoundTest {
    Round round;
    @Before
    public void setUp() throws Exception {
        round = new Round();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Unit-test done!");

    }

    @Test (timeout = 2000)
    public void testAreaOfRound() throws Exception {
        final double radius = 5;
        final double expectedResult = Math.PI*Math.pow(radius, 2);
        final double result = round.areaOfRound(radius);

        assertEquals(expectedResult, result);

    }

}