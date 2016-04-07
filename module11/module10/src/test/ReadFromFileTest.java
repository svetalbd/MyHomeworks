package test;

import com.goit.module10.loadtofile.ReadFromFile;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Svitlana Mykhailenko on 07.04.2016.
 */
@RunWith(value = Parameterized.class)
public class ReadFromFileTest {
    final private ReadFromFile readFromFile = new ReadFromFile();
    private String fileName;
    private StringBuilder loadingLine;

    public ReadFromFileTest(String fileName, StringBuilder loadingLine) {
        this.fileName = fileName;
        this.loadingLine = loadingLine;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"h.txt", new StringBuilder().append("IJK")},
            {"d.txt", new StringBuilder().append("ijk")},
            {"f.txt", new StringBuilder().append("9 ,")}
        });


    }

    @Test (timeout = 3000, expected = FileNotFoundException.class)
    public void testLoadTextFromFile() throws Exception {
        assertEquals("Not equals lines", loadingLine, readFromFile.loadTextFromFile(fileName));
    }

}