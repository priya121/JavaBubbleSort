import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            for (int j = 0; j < listOfNumbers.size(); j++) {
                while (listOfNumbers.get(i) < (listOfNumbers.get(j))) {
                    int smallerNumber = listOfNumbers.get(i);
                    listOfNumbers.set(i, listOfNumbers.get(j));
                    listOfNumbers.set(j, smallerNumber);
                }
            }
        }
        return listOfNumbers;
    }
}
