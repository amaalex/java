package lab1.compulsory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Initialization */
        System.out.println("Hello World!");
        List<String> languages = new ArrayList<>(
                Arrays.asList("C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java")
        );
        int n = (int) (Math.random() * 1000000);

        /* Number operations */
        n *= 3;
        Operations numberOperations = new Operations();
        n = numberOperations.addBinary("10101", n);
        n = numberOperations.addHexa("FF", n);
        n *= 6;
        n = numberOperations.sumOfDigits(n);

        /* Display the result */
        System.out.println("Willy-nilly, this semester I will learn " + languages.get(n));
    }
}
