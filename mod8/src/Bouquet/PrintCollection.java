package Bouquet;

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

    public static void main(String[] args) {
        //final List<Flower> myFlowers = new ArrayList<>();

        //sorted
        SortedSet<Flower> myFlowers = new TreeSet<>();

        myFlowers.add(new Chamomile("white ChM", 16));
        myFlowers.add(new Tulip("pink tulip", 12));
        myFlowers.add(new Chamomile("pink ChM", 7));
        myFlowers.add(new Rose("red rose", 9));

        int i=0;
        System.out.printf("%6s  %30s  %10s\n","number", "name", "amount");
        for (Flower flower: myFlowers) {
            System.out.printf("%6d  %30s  %10d\n",i, flower.getName().toString(), flower.getAmount());
            i++;
        }
    }

}

