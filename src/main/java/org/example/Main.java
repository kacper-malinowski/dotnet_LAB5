package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");
        Problem problem = new Problem(10, 37914, 1,10);
        System.out.print(problem);

        problem.sort();
        System.out.println("Posortowane: ");
        System.out.print(problem);

        Result result = problem.Solve(50);
        System.out.println(result);
    }
}