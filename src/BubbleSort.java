import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> unsortedList) {
        for (int i = 0; i < unsortedList.size(); i++) {
            for (int j = 0; j < unsortedList.size(); j++) {
                while (unsortedList.get(i) < (unsortedList.get(j))) {
                    int smallerNumber = unsortedList.get(i);
                    unsortedList.set(i, unsortedList.get(j));
                    unsortedList.set(j, smallerNumber);
                }
            }
        }
        return unsortedList;
    }
}
