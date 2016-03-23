package MusicInstruments;

import java.util.*;

/**
 * Created by Mykhailenko Svutlana on 23/03/2016.
 *
 * Anti-pattern
 */

public class NewMusicShop {
    private List<Trumpet> trumpets;
    private List<Piano> pianos;
    private List<Guitar> guitars;

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    @Override
    public String toString() {
        return "NewMusicShop{" +
                "trumpets=" + trumpets +
                ", pianos=" + pianos +
                ", guitars=" + guitars +
                '}';
    }


/*Module 7 To replace the following three procedures in the new Class*/
    /* - 1 - */
    public static ArrayList<Trumpet> prepareTrumpets(NewMusicShop shop, Map<String, Integer> order) {
        ArrayList<Trumpet> result = new ArrayList<>();

        List<Trumpet> trumpets = shop.getTrumpets();
        int numberOfTrumpetsToRemove = order.get("trumpet");

        int amountInStore = shop.getTrumpets().size();

        try {
            if (amountInStore < numberOfTrumpetsToRemove) throw new IllegalNumberOfThingsException("The number " +
                    "can not be more than ", amountInStore);
        } catch (IllegalNumberOfThingsException e){
            numberOfTrumpetsToRemove = 0;
            System.out.print(e.getMessage());
            System.out.println(e.getNumber());
        }
        List<Trumpet> trumpetsToRemove = shop.getTrumpets().subList(0, numberOfTrumpetsToRemove);
        List<Trumpet> trumpetsToStay = shop.getTrumpets().subList(numberOfTrumpetsToRemove, trumpets.size());
        shop.setTrumpets(trumpetsToStay);
        final boolean b = result.addAll(trumpetsToRemove);

        return result;

    }

    /* - 2 - */
    public static ArrayList<Piano> preparePianos(NewMusicShop shop, Map<String, Integer> order) {
        ArrayList<Piano> result = new ArrayList<>();

        List<Piano> pianos = shop.getPianos();
        int numberOfTPianosToRemove = order.get("piano");
        int amountInStore = shop.getPianos().size();

        try {
            if (amountInStore < numberOfTPianosToRemove) throw new IllegalNumberOfThingsException("The number can " +
                    "not be more than ", amountInStore);
        } catch (IllegalNumberOfThingsException e){
            numberOfTPianosToRemove = 0;
            System.out.print(e.getMessage());
            System.out.println(e.getNumber());
        }

        List<Piano> pianosToRemove = shop.getPianos().subList(0, numberOfTPianosToRemove);
        List<Piano> pianosToStay = shop.getPianos().subList(numberOfTPianosToRemove, pianos.size());
        shop.setPianos(pianosToStay);
        final boolean b = result.addAll(pianosToRemove);

        return result;

    }

    /* - 3 - */
    public static ArrayList<Guitar> prepareGuitars(NewMusicShop shop, Map<String, Integer> order) {
        ArrayList<Guitar> result = new ArrayList<>();
        List<Guitar> guitars = shop.getGuitars();
        int numberOfTGuitarsToRemove = order.get("guitar");

        int amountInStore = shop.getGuitars().size();

        try {
            if (amountInStore < numberOfTGuitarsToRemove) throw new IllegalNumberOfThingsException("The number" +
                    " can not be more than ", amountInStore);
        } catch (IllegalNumberOfThingsException e){
            numberOfTGuitarsToRemove = 0;
            System.out.print(e.getMessage());
            System.out.println(e.getNumber());
        }


        List<Guitar> guitarsToRemove = shop.getGuitars().subList(0, numberOfTGuitarsToRemove);
        List<Guitar> guitarsToStay = shop.getGuitars().subList(numberOfTGuitarsToRemove, guitars.size());
        shop.setGuitars(guitarsToStay);
        final boolean b = result.addAll(guitarsToRemove);

        return result;

    }

    public static Map<String, Integer> listOfInstrument () {
        Map newList = new HashMap();
        boolean printExit = false;
        String nameOfInstrument = "";
        int countPiano = 0;
        int countGuitar = 0;
        int countTrumpet = 0;
        int preview = 0;
        boolean allIsOK = false;

        while (printExit == false) {
            printExit = false;
            System.out.println("Enter a musical instrument or \"exit\":\n");

            Scanner sc = new Scanner(System.in);
            nameOfInstrument = sc.next();

            switch (nameOfInstrument) {
                case "piano":
                    allIsOK = false;
                    if (allIsOK == false) {
                        System.out.println( "Enter a count of pianos" );
                        try {
                            allIsOK = true;
                            preview = sc.nextInt();
                            if (preview < 0) {
                                allIsOK = false;
                                throw new NegativeNumberException( countPiano,
                                        "The amount of instruments can not be negative" );
                            }
                        } catch (InputMismatchException e) {
                            System.out.print( "Input value, please\n" );
                            allIsOK = false;
                        } catch (NegativeNumberException e) {
                            System.out.println( e.getMessage() );
                            System.out.println( e.getNumber() );
                            countPiano = 0;
                            allIsOK = false;
                        }
                    }
                    if (allIsOK == true)  {
                        countPiano = preview;
                    }
                    break;

                case "guitar":
                    allIsOK = false;
                    if (allIsOK == false) {
                        System.out.println( "Enter a count of guitars" );
                        try {
                            allIsOK = true;
                            preview = sc.nextInt();
                            if (preview < 0) {
                                allIsOK = false;
                                throw new NegativeNumberException( countGuitar,
                                        "The amount of instruments can not be negative" );
                            }
                        } catch (NegativeNumberException e) {
                            System.out.println( e.getMessage() );
                            System.out.println( e.getNumber() );
                            countGuitar = 0;
                            allIsOK = false;
                        } catch (InputMismatchException e) {
                            System.out.print( "Input value, please\n" );
                            allIsOK = false;
                        }
                    }
                    if (allIsOK == true)  {
                        countGuitar = preview;
                    }
                    break;

                case "trumpet":
                    allIsOK = false;
                    if (allIsOK == false) {
                        System.out.println( "Enter a count of trumpets" );
                        try {
                            allIsOK = true;
                            preview = sc.nextInt();
                            if (preview < 0) {
                                allIsOK = false;
                                countTrumpet = 0;
                                throw new NegativeNumberException( countTrumpet,
                                        "The amount of instruments can not be negative" );
                            }
                        } catch (NegativeNumberException e) {
                            System.out.println( e.getMessage() );
                            System.out.println( e.getNumber() );
                            countTrumpet = 0;
                            allIsOK = false;
                        } catch (InputMismatchException e) {
                            System.out.print( "Input value, please\n" );
                            allIsOK = false;
                            countTrumpet = 0;
                        }
                    }
                    if (allIsOK == true)  {
                        countTrumpet = preview;
                    }
                    break;
                case "exit":
                    printExit = true;
                    break;
                default:
                    System.out.println ("Unknown music instrument");
                    break;
            }

        }
        newList.put("piano", countPiano);
        newList.put("guitar", countGuitar);
        newList.put("trumpet", countTrumpet);

        return newList;
    }

    public static void main (String[] args){
        NewMusicShop shop = new NewMusicShop();
        ArrayList<Trumpet> trumpets = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            trumpets.add(new Trumpet());
        }
        shop.setTrumpets(trumpets);
        ArrayList<Piano> pianos = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            pianos.add(new Piano());
        }
        shop.setPianos(pianos);

        ArrayList<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            guitars.add(new Guitar());
        }
        shop.setGuitars(guitars);

        System.out.println(shop);

        Map<String, Integer> order = new HashMap<>();
        order = listOfInstrument();


        ArrayList<Trumpet> trumpetsToRemove = prepareTrumpets(shop, order);
        System.out.println("removed trumpets: " + trumpetsToRemove.size());

        ArrayList<Piano> pianosToRemove = preparePianos(shop, order);
        System.out.println("removed pianos: " + pianosToRemove.size());

        ArrayList<Guitar> guitarsToRemove = prepareGuitars(shop, order);
        System.out.println("removed guitars: " + guitarsToRemove.size());


        System.out.println(shop);
    }
}
