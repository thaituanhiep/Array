package array;

import java.io.IOException;
import java.util.Scanner;

public class CountCharInWord {
    public static void main(String[] args) throws IOException {
        String word = "";
        char search;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: ");
        word = input.nextLine();
        System.out.println("search char: ");
        search = (char) System.in.read();

        int count = 0;
//        for (char c : word.toCharArray()) {
//            if (c == search)
//                count++;
//        }
        count += word.chars().filter(c -> c == search).count();
        System.out.println("count char in word: " + count);
    }
}
