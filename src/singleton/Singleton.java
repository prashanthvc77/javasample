package singleton;


public class Singleton {

    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to provide the global point of access to the Singleton instance
    public static Singleton getInstance() {
        // Check if the instance is null (lazy-loading)
        if (instance == null) {
            // Use synchronized block to make the creation thread-safe
            synchronized (Singleton.class) {
                // Double-check the instance to prevent multiple thread creation
                if (instance == null) {
                    // Create the instance if it doesn't exist
                    instance = new Singleton();
                }
            }
        }
        // Return the singleton instance
        return instance;
    }
    
}

