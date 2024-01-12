package samples;

//Custom exception class
class CustomException extends Exception {
 public CustomException
() {
     super("This is a custom exception.");
 }

 public CustomException(String message) {
     super(message);
 }
}

//Example of using the custom exception
public class CustomExceptionExample {
 public static void main(String[] args) {
     try {
         // Simulating a situation that triggers the custom exception
         throwCustomException();
     } catch (CustomException e) {
         System.out.println("Caught custom exception: " + e.getMessage());
     }
 }

 // Method that throws the custom exception
 private static void throwCustomException() throws CustomException{
     // Some condition that triggers the exception
     boolean condition = true;

     if (condition) {
         throw new CustomException("This is a custom exception with a specific message.");
     }
 }
}
