package test;

import com.goitonline.mod4.temperatureConvertor.FormCelToFar;
import org.junit.*;

import junit.framework.Assert;

/**
 * Created by Mykhailenko Svitlana on 04.04.2016.
 */
public class FormCelToFarTest {

    FormCelToFar formCelToFar;
    @Before
    public void setUp() throws Exception {
        formCelToFar = new FormCelToFar();
    }


    @Test (timeout = 2000)
    public void convertFromCelsiusToFarrengeyt() throws Exception {
        //FormCelToFar formCelToFar = new FormCelToFar();
        final double x = 36.6;

        final double result = formCelToFar.ConvertFromCelsiusToFarrengeyt(x);

        final double extendedResult = x*9/5+32;

        Assert.assertEquals(result, extendedResult, 1);

    }

    @Test (timeout = 2000)
    public void convertFromFarrengeytToCelsius() throws Exception {
        final double x = 97.7;

        final double result = formCelToFar.ConvertFromFarrengeytToCelsius(x);

        final double extendedResult = (x-32d)*(5d/9d);

        Assert.assertEquals(result, extendedResult);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Unit-testing is ended.");
    }

}