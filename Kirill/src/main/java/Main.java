import fibonacci4.TestFibonacci;
import random1.TestRandom;
import simpleNumber2.TestSimpleNumber;
import sorted3.TestSorted;
import sorted3.TestSortedModel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ex1
        TestRandom testRandom = new TestRandom();
        testRandom.findRandomNumber();
        //ex2
        TestSimpleNumber simpleNumber = new TestSimpleNumber();
        List<Integer> simpleNumbers = simpleNumber.findSimpleNumbers();
        simpleNumbers.forEach(System.out::println);
        //ex3
        TestSorted testSorted = new TestSorted();
        List<TestSortedModel> testSortedModels = testSorted.sortedArray();
        testSortedModels.forEach(item -> System.out.println(item.getName() + " " + item.getLastName()));
        //ex4
        TestFibonacci fibonacci = new TestFibonacci();
        System.out.println(fibonacci.findFibonacciNumberInSequence(10));
        //ex5
        Double meters = 17.73;
        /*
        System.out.println("Футов = " + new FootConverter().getConvertedValue(meters));
        System.out.println("Морских миль = " + new NauticalMileConverter().getConvertedValue(meters));
        System.out.println("Миль = " + new MileConverter().getConvertedValue(meters));
        System.out.println("Киллометров = " + new KilometerConverter().getConvertedValue(meters));
         */

    }
}
