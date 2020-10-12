package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;

        //Input value to array
        System.out.println("Input size of array: ");
        size = input.nextInt();
        array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Input value of index " + i + " in array:");
//            array[i] = input.nextInt();
//        }
        IntStream.range(0,array.length).forEach(value -> {
            System.out.println("Input value of index " + value + " in array:");
            array[value] = input.nextInt();
        });

        //display data
        int min;
        min = Arrays.stream(array).min().getAsInt();

        System.out.print("\narray : ");
        Arrays.stream(array).forEach(value -> {
            System.out.print(value + "\t");
        });
        System.out.print("\nMinimum of array is: " + min);
    }
}
