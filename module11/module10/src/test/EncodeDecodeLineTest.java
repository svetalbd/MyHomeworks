package test;

import com.goit.module10.loadtofile.EncodeDecodeLine;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by Mykhailenko Svitlana on 07.04.2016.
 */
@RunWith(value = Parameterized.class)
public class EncodeDecodeLineTest {
    final private EncodeDecodeLine encodeDecodeLine = new EncodeDecodeLine();
    private String encodedLine;
    private String decodedLine;

    public EncodeDecodeLineTest(String encodedLine, String decodedLine) {
        this.encodedLine = encodedLine;
        this.decodedLine = decodedLine;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"ABC", "IJK"},
                {"abc", "ijk"},
                {"123", "9 ,"}
        });

    }

    @org.junit.Test (timeout = 2000)
    public void testEncodeLine() throws Exception {
        Assert.assertEquals("Wrong", decodedLine, encodeDecodeLine.encodeLine(encodedLine));
    }

    @org.junit.Test (timeout = 2000)
    public void testDecodeLine() throws Exception {
        Assert.assertEquals("Bad key", encodedLine, encodeDecodeLine.decodeLine(decodedLine));
    }
}