import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueNumberExtractorTest {
    static UniqueNumberExtractor extractor;

    @BeforeAll
    static void createObj() {
        extractor = new UniqueNumberExtractor();
    }

    @Test
    void firstTest() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);

    }

    @Test
    void secondTest() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();
        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);

    }

    @Test
    void firthTest() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }

    @Test
    void Test() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -2, -1, 0);
        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(-1, -2, -3, 0));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
    @Test
    void test() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(2, 2, 2, 2);
        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(2));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }

}



