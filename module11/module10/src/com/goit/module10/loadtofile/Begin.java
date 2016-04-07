package com.goit.module10.loadtofile;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by c on 29.03.2016.
 */
public class Begin {
    public static void main (String[] args){
        //read new message
        System.out.println ("Input your message for writing to file:");
        Scanner in = new Scanner(System.in);
        String newMessage = in.nextLine();

        //read name of file
        System.out.println ("Input file name:");
        in = new Scanner(System.in);
        String fileName = in.nextLine();

        //crypt new message and write to file
        EncodeDecodeLine code = new EncodeDecodeLine();
        String codedLineReturned = code.encodeLine(newMessage.toString());
        StringBuilder codedLine = new StringBuilder();
        codedLine.append(codedLineReturned);
        WriteToFile loadToFile = new WriteToFile();
        loadToFile.loadLineToFile(fileName, codedLine);
        System.out.format("The message \"%s\" is writing to file \"%s\"%n", codedLine, fileName);

        // /read from file
        System.out.format("Reading message from file \"%s\"%n:", fileName);
        ReadFromFile readMessage = new ReadFromFile();
        try {
            codedLine = readMessage.loadTextFromFile(fileName);
            System.out.format("\"%s\" is decrypted to \"%s\"%n", codedLine, code.decodeLine(codedLine.toString()));

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: a problem with a reading from file.");
            e.printStackTrace();
        }
    }
}
