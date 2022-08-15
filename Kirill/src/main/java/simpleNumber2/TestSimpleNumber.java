package simpleNumber2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static util.Util.generateRandomArrayList;

public class TestSimpleNumber {
    public List<Integer> findSimpleNumbers() {
        List<Integer> numbersList = generateRandomArrayList();
        List<Integer> simpleNumbersList = new ArrayList<>();

        Collectors collectors;
        numbersList.stream()
                .peek(it -> {
                    if (it == 0 || it == 1) {
                        simpleNumbersList.add(it);
                    } else {
                        if (it % numbersList.get(it.byteValue()) == 0) {
                            simpleNumbersList.add(it);
                        }
                    }
                }).collect(Collectors.toList());
        return simpleNumbersList;
    }
}