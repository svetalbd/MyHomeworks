package com.goit.module10.loadtofile;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;
import sun.java2d.pipe.BufferedRenderPipe;

import java.io.*;

import static java.lang.String.valueOf;

/**
 * Created by Mykhailenko Svitlana on 29.03.2016.
 */
public class ReadFromFile {

    public StringBuilder loadTextFromFile (String fileName) throws FileNotFoundException {
        StringBuilder outputLine = new StringBuilder();
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    outputLine.append(s);
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return outputLine;
    }
}

