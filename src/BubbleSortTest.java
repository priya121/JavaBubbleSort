import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BubbleSortTest {
    BubbleSort bSort = new BubbleSort();

    @Test
    public void sortsOne() {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(1);
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        assertEquals(sortedList, bSort.sort(unsortedList));
    }

    @Test
    public void sortsTwo() {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(2);
        unsortedList.add(1);
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(2);
        assertEquals(sortedList, bSort.sort(unsortedList));
    }

    @Test
    public void sortsThree() {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(3);
        unsortedList.add(2);
        unsortedList.add(1);
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        assertEquals(sortedList, new BubbleSort().sort(unsortedList));
    }

    @Test
    public void sortsFour() {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(4);
        unsortedList.add(3);
        unsortedList.add(2);
        unsortedList.add(1);
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(4);
        assertEquals(sortedList, new BubbleSort().sort(unsortedList));
    }
}