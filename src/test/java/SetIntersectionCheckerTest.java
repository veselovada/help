import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SetIntersectionCheckerTest {

    static SetIntersectionChecker extractor ;
    @BeforeAll
    static void createObj() {
        extractor = new SetIntersectionChecker();
    }

    @Test
    public void firstTest() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        assertTrue(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void secondTest() {
        Set<Integer> set1 = Set.of(1, 2);
        Set<Integer> set2 = Set.of(3, 4);

        assertFalse(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void firthTest() {
        Set<Integer> set1 = Set.of();
        Set<Integer> set2 = Set.of(1, 2);

        assertFalse(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void fourthTest() {
        Set<Integer> set1 = Set.of();
        Set<Integer> set2 = Set.of();

        assertFalse(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void test() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3);

        assertTrue(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void Test() {
        Set<Integer> set1 = Set.of(-1, -2, -3);
        Set<Integer> set2 = Set.of(1, 2, 3);

        assertFalse(extractor.isIntersecting(set1, set2));
    }
}

