package com.goit.module10.loadtofile;

import javax.annotation.processing.FilerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Mykhailenko Svitlana on 29.03.2016.
 */
public class WriteToFile {

    public void loadLineToFile (String fileName, StringBuilder line){
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e){
            System.out.println("ERROR: a problem with creating or loading file.");
        }
        try {
            PrintWriter writing = new PrintWriter(file.getAbsoluteFile());
            writing.print(line);
            writing.close();
        } catch (FileNotFoundException e){
            System.out.println("ERROR: file not found.");
        }
    }
}
