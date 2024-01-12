package optionaltest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalListStream {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        String target = "Banana";

        //stringList.stream(): This line converts the List stringList into a stream.
        //A stream is a sequence of elements that can be processed in a functional and declarative style.

       // .filter(item -> item.equals(target)): This line applies a filter operation to the stream.
        //The filter operation takes a predicate (in this case, a lambda expression) that determines
        //which elements from the stream should be included in the resulting stream.
        //Here, it filters elements that are equal to the target string.

        //.findFirst(): This line is used to retrieve the first element that matches the filter
        //condition. It returns an Optional object containing the first matching element or an 
        //empty Optional if no match is found.

        //By using a stream and the filter operation, you can easily search for a specific value 
        //in a collection (in this case, a List) while maintaining a clean and functional programming style. 
        //The use of Optional helps handle the cases where a value is found and when it's not in the list,
        //preventing null pointer exceptions.

        Optional<String> result = stringList.stream()
                .filter(item -> item.equals(target))
                .findFirst();
        //------------------------------------------
        if (result.isPresent()) {
            System.out.println("Found: " + result.get());
        } else {
            System.out.println("Not found: " + target);
        }

        // Another example with a value not in the list
        //target = "Grapes";
        result = stringList.stream()
                .filter(item -> item.equals(target))
                .findFirst();

        if (result.isPresent()) {
            System.out.println("Found: " + result.get());
        } else {
            System.out.println("Not found: " + target);
        }
    }
}

