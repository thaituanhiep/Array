package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StudentPassExam {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        //Input value to array
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter a mark for student " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
        IntStream.rangeClosed(1,size).forEach(i -> {
            System.out.print("Enter a mark for student " + i + ": ");
            array[i - 1] = scanner.nextInt();
        });

        //display data
        int count = 0;
        System.out.print("List of mark: ");
        Arrays.stream(array).forEach(value -> {
            System.out.print(value + "\t");
        });
        count = (int) Arrays.stream(array).filter(value -> value >= 5).count();
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
