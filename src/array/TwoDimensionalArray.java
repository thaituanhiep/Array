package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        double[][] array = inputValueArray();
        displayArray(array);

        //Sum of column
        System.out.println("Sum of column 2: " + sumOfColumnArray(array, 2));

        //Max of array
        double max;
        max = Arrays.stream(array).flatMapToDouble(Arrays::stream).max().getAsDouble();
        System.out.println("Max of two dimensional array: " + max);

        //Sum 2 array
        double[][] array2 = inputValueArray();
        displayArray(array2);
        double[][] sumArray = addition2Matrices(array, array2);
        displayArray(sumArray);
    }

    private static double[][] inputValueArray() {
        int row = 0, column = 0;
        double[][] array;
        Scanner input = new Scanner(System.in);
        System.out.println("input size of row: ");
        row = input.nextInt();
        System.out.println("input size of column: ");
        column = input.nextInt();
        array = new double[row][column];

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.printf("input value of array[%d][%d] : ", i + 1, j + 1);
//                array[i][j] = input.nextDouble();
//            }
//        }
        int finalColumn = column;
        IntStream.range(0, row).forEach(i -> {
            IntStream.range(0, finalColumn).forEach(j -> {
                System.out.printf("input value of array[%d][%d] : ", i + 1, j + 1);
                array[i][j] = input.nextDouble();
            });
        });
        return array;
    }

    private static void displayArray(double[][] array) {
        System.out.println();
        Arrays.stream(array).forEach(arr -> {
            Arrays.stream(arr).forEach(value -> {
                System.out.print(value + "    ");
            });
            System.out.println();
        });
        System.out.println();
    }

    private static double sumOfColumnArray(double[][] array, int column) {
        double sum = 0;
//        sum = Arrays.stream(array)
//                .map(x -> x[column - 1])
//                .collect(Collectors.summingDouble(Double::doubleValue));
        sum = Arrays.stream(array)
                .map(x -> x[column - 1]).mapToDouble(Double::doubleValue).sum();
        return sum;
    }

    private static double[][] addition2Matrices(double[][] array, double[][] array2) {
        if (array.length != array2.length || array[0].length != array2[0].length) {
            return null;
        }
        int row = array.length, column = array[0].length;
        double[][] result = new double[row][column];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                result[i][j] = array[i][j] + array2[i][j];
//            }
//        }
        IntStream.range(0,row).forEach(i -> {
            IntStream.range(0, column).forEach(j -> {
                result[i][j] = array[i][j] + array2[i][j];
            });
        });
        return result;
    }
}
