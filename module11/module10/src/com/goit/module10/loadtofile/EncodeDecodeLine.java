package com.goit.module10.loadtofile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mykhailenko Svitlana й on 29.03.2016.
 */
public class EncodeDecodeLine {
    final private int KEY = 8;

    //return alphabet that is used for coding
    protected List<Character> englishAlphabet(){
        List<Character> englishAlphabet = new ArrayList<Character>();
        final char[] PUNCTUATION = {' ', ',', '.', '<', '>', '?', '|', '/', ':', ';', '[', ']',
                '=', '-','+','(', ')','&','^','%','$','#','@','!', '{', '}', '\'', '"', '\\'};
        for (char ch ='A'; ch <='Z'; ch++){
            englishAlphabet.add(ch);
        }
        for (char ch ='a'; ch <='z'; ch++){
            englishAlphabet.add(ch);
        }
        for (char ch ='0'; ch <='9'; ch++){
            englishAlphabet.add(ch);
        }
        for (char ch: PUNCTUATION){
            englishAlphabet.add(ch);
        }

        return englishAlphabet;
    }

    //code line using Caesar algorithm
    public String encodeLine (String line){
        char[] myList = new char[line.length()];
        line.getChars(0, line.length(), myList, 0);
        StringBuilder codedLine = new StringBuilder();
        List<Character> englishAlphabet = englishAlphabet();
        int power = englishAlphabet.size();
        for (int i = 0; i<line.length(); i++){
            int index;
            index = englishAlphabet.indexOf(line.charAt(i));
            index =(index + KEY) % power;
            try {
                codedLine.append(englishAlphabet.get(index));
            } catch (NullPointerException e){
                System.out.println("ERROR: The line is empty.");
            }
        }

        return codedLine.toString();
    }

    //decode line using Caesar algorithm
    public String decodeLine (String line){
        StringBuilder decodedLine = new StringBuilder();
        List<Character> englishAlphabet = englishAlphabet();
        int power = englishAlphabet.size();
        for (int i = 0; i<line.length(); i++){
            int index;
            index = englishAlphabet.indexOf(line.charAt(i));
            index =(index - KEY + power) % power;
            decodedLine.append(englishAlphabet.get(index));
        }

        return decodedLine.toString();
    }


}
