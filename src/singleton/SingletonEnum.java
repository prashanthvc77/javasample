package singleton;

//Define an enum named Singleton to implement the Singleton pattern
public enum SingletonEnum {

 // The single instance of the singleton, named INSTANCE
 INSTANCE;

 // Other methods and properties of the singleton can be added here

 // Example method within the singleton
 public void doSomething() {
     // Output a simple message indicating that the singleton is doing something
     System.out.println("Singleton is doing something.");
 }

 // Example usage of the Singleton
 public static void main(String[] args) {
     // Access the singleton instance using the enum constant
	 SingletonEnum singleton = SingletonEnum.INSTANCE;

     // Use singleton methods or properties
     singleton.doSomething();
 }
}


