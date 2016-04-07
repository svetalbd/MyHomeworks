package test;

import com.goit.mod9.cezare.CodingAlgorithmCaesar;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 06.04.2016.
 */
@RunWith(value = Parameterized.class)
public class CodingAlgorithmCaesarTest {
    final private CodingAlgorithmCaesar codingAlgorithmCaesar = new CodingAlgorithmCaesar();
    private String encryptedLine;
    private int keyValue;
    private String decryptedLine;


    public CodingAlgorithmCaesarTest(String encryptedLine, int keyValue, String decryptedLine) {
        this.decryptedLine = decryptedLine;
        this.keyValue = keyValue;
        this.encryptedLine = encryptedLine;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"ABC", 3, "DEF"},
                {"abc", 2, "cde"},
                {"123", 4, "567"}
        });

    }

    @Test (timeout = 3000)
    public void encryption() throws Exception {
        assertEquals("Wrong key", decryptedLine, codingAlgorithmCaesar.encryption(encryptedLine, keyValue));
    }

    @Test (timeout = 3000)
    public void decryption() throws Exception {
       assertEquals("Wrong key", encryptedLine, codingAlgorithmCaesar.decryption(decryptedLine, keyValue));
    }

}