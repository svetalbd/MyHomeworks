package com.goit.mod9.cezare;

/**
 * Created by Mykhailenko Svitlana on 23.03.2016.
 */
public abstract class Flower implements Comparable {
    private String name;
    private int amount;

    public Flower(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Object object) {
        Flower entry = (Flower) object;

        int result = name.compareTo(entry.name);
        if(result != 0) {
            return result;
        }

        result = amount - entry.amount;

        if(result != 0) {
            return (int) result / Math.abs( result );
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

}
