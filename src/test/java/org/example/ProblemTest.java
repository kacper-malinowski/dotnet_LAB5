package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {
    @Test
    public void PackingTest() {
        Problem problem = new Problem(10, 37914, 1,10);
        problem.sort();
        Result result = problem.Solve(50);
        Assert.assertFalse(result.stolenItems.isEmpty());
    }

    @Test
    public void EmptyPackingTest() {
        Problem problem = new Problem(10, 37914, 1,10);
        problem.sort();
        Result result = problem.Solve(0);
        Assert.assertTrue(result.stolenItems.isEmpty());
    }

    @Test
    public void ItemGenerationTest() {
        int lb = 1;
        int ub = 10;
        Problem problem = new Problem(10, 37914, lb, ub);
        Boolean isGood = true;
        for (Item item : problem.itemList){
            if(item.weight < lb || item.weight > ub || item.value < lb || item.value > ub){
                isGood = false;
                break;
            }
        }
        Assert.assertTrue(isGood);
    }

    @Test
    public void InstanceTest() {

        Problem problem = new Problem();
        problem.itemList = new ArrayList<>();
        problem.itemList.add(new Item(1, 5, 10));
        problem.itemList.add(new Item(2, 2, 7));
        problem.itemList.add(new Item(3, 10, 3));
        problem.itemList.add(new Item(4, 1, 1));
        problem.sort();
        Result result = problem.Solve(9);
        Assert.assertTrue(result.nItems == 5 || result.value == 29 || result.weight == 9);
    }
}