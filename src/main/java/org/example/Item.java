package org.example;

public class Item {
    public int id;
    public int weight;
    public int value;
    public int effectiveValue;
    public Item(int id, int weight, int value) {
        this.id = id;
        this.weight = weight;
        this.value = value;
        float efTemp = (float) value / (float) weight * 100;
        effectiveValue = (int)efTemp;
    }
    public String toString(){
        return "ID: " + id + " Weight: " + weight + " Value: " + value + " ef: " + effectiveValue + "\n";
    }
}
