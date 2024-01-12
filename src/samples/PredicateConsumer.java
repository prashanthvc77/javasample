package samples;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumer {
    public static void main(String[] args) {
        // Example usage:
        int number = 6;
        // Using the isEven predicate and printSquare consumer
        processIfEven(number, isEven, printSquare);
    }

    // Reusable predicate
    static Predicate<Integer> isEven = num -> num % 2 == 0;

    // Reusable consumer
    static Consumer<Integer> printSquare = num -> {
        int square = num * num;
        System.out.println("The square of " + num + " is " + square);
    };

    // Using predicate and consumer together
    static void processIfEven(int num, Predicate<Integer> predicate,
    		Consumer<Integer> consumer) {
        if (predicate.test(num)) {
            consumer.accept(num);
        } else {
            System.out.println(num + " is not even.");
        }
    }
}
