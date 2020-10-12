package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertDeleteToIndexArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 7, 2, 0, 4, 8};

        array = insertToIndexArray(array, 3, 5);
        Arrays.stream(array).forEach(value -> {
            System.out.print(value + "\t");
        });

        array = deleteInArray(array, 4);
        System.out.println();
        Arrays.stream(array).forEach(value -> {
            System.out.print(value + "\t");
        });
    }

    private static int[] insertToIndexArray(int[] array, int index, int number) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        list.add(index, number);
        int[] result = list.stream().mapToInt(x -> x).toArray();
        return result;
    }

    private static int[] deleteInArray(int[] array, int number) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        list.remove(new Integer(number));
        int[] result = list.stream().mapToInt(x -> x).toArray();
        return result;
    }
}
