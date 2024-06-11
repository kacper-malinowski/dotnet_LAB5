package org.example;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public int nItems;
    public int weight;
    public int value;
    public List<Integer> stolenItems;

    public Result(int nItems, int weight, int value, List<Integer> stolenItems) {
        this.nItems = nItems;
        this.weight = weight;
        this.value = value;
        this.stolenItems = stolenItems;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stolen " + nItems + "items:\n");
        sb.append("IDs: " + stolenItems + "\n");
        sb.append("With a total value of " + value + " with a total weight of: " + weight + "\n");
        return sb.toString();
    }
}
