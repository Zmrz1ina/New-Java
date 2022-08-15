package sorted3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TestSorted {
    public List<TestSortedModel> sortedArray(){
        List<TestSortedModel> testSortedModels = Arrays.asList(
                new TestSortedModel("Stas", "Aleshkevich"),
                new TestSortedModel("a", "B"),
                null);
//        return ur code
        return testSortedModels.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(TestSortedModel::getName, String.CASE_INSENSITIVE_ORDER)
                        .thenComparing(TestSortedModel::getLastName, String.CASE_INSENSITIVE_ORDER))
                .collect(Comparator.toList());
    }
}