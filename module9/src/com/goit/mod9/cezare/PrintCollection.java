package com.goit.mod9.cezare;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Mykhailenko Svitlana on 23.03.2016.
 */
public class PrintCollection {
    private static HashSet<String> asters = new HashSet<>();
    private static HashSet<String> chamomiles = new HashSet<>();
    private static HashSet<String> roses = new HashSet<>();
    private static HashSet<String> tulips = new HashSet<>();

    public static HashSet<String> getAsters() {
        return asters;
    }

    public static HashSet<String> getChamomiles() {
        return chamomiles;
    }

    public static HashSet<String> getRoses() {
        return roses;
    }

    public static HashSet<String> getTulips() {
        return tulips;
    }

    @Override
    public String toString() {
        return "PrintCollection{" +
                "asters=" + asters +
                ", chamomiles=" + chamomiles +
                ", roses=" + roses +
                ", tulips=" + tulips +
                '}';
    }

    public static void main(String[] args) throws IOException {
        final List<Flower> myFlowers = new ArrayList<>();
        myFlowers.add(new Chamomile("white ChM", 16));
        myFlowers.add(new Tulip("pink tulip", 12));
        myFlowers.add(new Chamomile("pink ChM", 7));
        myFlowers.add(new Rose("red rose", 9));

        //sorted
        /*SortedSet<Flower> myFlowers = new TreeSet<>();

        myFlowers.add(new Chamomile("white ChM", 16));
        myFlowers.add(new Tulip("pink tulip", 12));
        myFlowers.add(new Chamomile("pink ChM", 7));
        myFlowers.add(new Rose("red rose", 9));*/

        //print collection
        int i=0;
        System.out.printf("%6s  %30s  %10s\n","number", "name", "amount");
        for (Flower flower: myFlowers) {
            System.out.printf("%6d  %30s  %10d\n",i, flower.getName().toString(), flower.getAmount());
            i++;
        }

        //coding using Caesar algorithm
        CodingAlgorithmCaesar some = new CodingAlgorithmCaesar();
        String newCrupt = null;
        System.out.printf("Input key value from 1 to %3d", some.EnglishAlphabet().size());
        Scanner in = new Scanner(System.in);
        boolean correctValue = false;
        int k=0;
        while (correctValue == false) {
            try {
                correctValue = true;
                k = in.nextInt();
            } catch (InputMismatchException e) {
                correctValue = false;
                System.out.println("ERROR: Input correct value. It must be INTEGER");
                break;
            }
        }

        if (k>0) {
            try {
                newCrupt = some.Encription(myFlowers, k);
            } catch (IOException e) {
                e.printStackTrace();
            }


            //decoding using Caesar algorithm
            some.Decription(newCrupt, k);
        } else {
            System.out.println("ERROR: Impossible to crypt or decrypt.");
        }

    }

}

