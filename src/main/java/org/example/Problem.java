package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Problem {
    private int n;
    private int seed;
    private int lowerBound;
    private int upperBound;
    public List<Item> itemList;
    public List<Item> sortedList;
    public Problem(int n, int seed, int lowerBound, int upperBound) {
        this.n = n;
        this.seed = seed;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        itemList = new ArrayList<Item>();

        Random rand  = new Random(seed);
        int randVal;
        int randWeight;
        for (int i = 0; i < n; i++) {
            randVal = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
            randWeight = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
            itemList.add(new Item(i, randWeight, randVal));
        }
    }
    public Problem() {}
    public void sort(){
        itemList.sort((o1, o2) -> (o2.effectiveValue - o1.effectiveValue));
    }
    public Result Solve(int capacity){
        int nItems = 0;
        int weight = 0;
        int value = 0;
        List<Integer> stolenItems = new ArrayList<Integer>();

        for(Item item : itemList){
            while (weight + item.weight <= capacity){
                stolenItems.add(item.id);
                weight += item.weight;
                value += item.value;
                nItems++;
            }
        }
        return new Result(nItems, weight, value, stolenItems.stream().toList());
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : itemList) {
            sb.append(item);
        }
        return sb.toString();
    }
}
