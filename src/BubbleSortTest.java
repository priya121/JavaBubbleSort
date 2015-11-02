import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BubbleSortTest {
    BubbleSort bSort = new BubbleSort();
    List<Integer> unsortedList = new ArrayList<>();
    List<Integer> sortedList = new ArrayList<>();

    @Test
    public void sortsOne() {
        unsortedList.add(1);
        sortedList.add(1);
        assertEquals(sortedList, bSort.sort(unsortedList));
    }

    @Test
    public void sortsTwo() {
        unsortedList.add(2);
        unsortedList.add(1);
        sortedList.add(1);
        sortedList.add(2);
        assertEquals(sortedList, bSort.sort(unsortedList));
    }

    @Test
    public void sortsThree() {
        unsortedList.add(3);
        unsortedList.add(2);
        unsortedList.add(1);
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        assertEquals(sortedList, bSort.sort(unsortedList));
    }

    @Test
    public void sortsFour() {
        unsortedList.add(4);
        unsortedList.add(3);
        unsortedList.add(2);
        unsortedList.add(1);
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(4);
        assertEquals(sortedList, bSort.sort(unsortedList));
    }
}