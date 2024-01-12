package samples;

import java.util.HashMap;
import java.util.Map;

/**
 * In this example, the Box class has a generic type parameter T, and it
 * contains a public instance variable value of type T. Instances of Box
 * can be created with different types, allowing for flexibility and type safety.
 * @param <T>
 */
public class Box<T> {
    public T val;

    public Box(T value) {
        this.val = value;
    }

    public T getValue() {
        return val;
    }

    public static void main(String[] args) {
        // Creating a Box of Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Boxed Integer value: " + intBox.getValue());

        // Creating a Box of String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("Boxed String value: " + strBox.getValue());
        
        Box<Boolean> bBox = new Box<>(false);
        System.err.println("Boxed bool value: "+bBox.getValue());
    }
    
    
   
    
}

