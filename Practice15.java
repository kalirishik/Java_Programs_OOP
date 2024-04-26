// Debuggable interface (can be abstract class as well)
interface Debuggable {
    void debugInfo();
    void debugError(String errorMessage);
}

// Base class that implements Debuggable
abstract class BaseClass implements Debuggable {
    // Common implementation for debugInfo in the base class
    @Override
    public void debugInfo() {
        System.out.println("Debugging information from the base class");
    }

    // Common implementation for debugError in the base class
    @Override
    public void debugError(String errorMessage) {
        System.err.println("Error: " + errorMessage);
    }
}

// Sample class inheriting from the base class
class MyClass1 extends BaseClass {
    // Additional methods and fields specific to MyClass

    // MyClass-specific implementation for debugInfo
    @Override
    public void debugInfo() {
        // Additional implementation for MyClass
        System.out.println("Debugging information from MyClass");
    }
}

// Another sample class inheriting from the base class
class AnotherClass extends BaseClass {
    // Additional methods and fields specific to AnotherClass

    // AnotherClass-specific implementation for debugInfo
    @Override
    public void debugInfo() {
        // Additional implementation for AnotherClass
        System.out.println("Debugging information from AnotherClass");
    }
}

// Main class for testing
public class Practice15 {
    public static void main(String[] args) {
        // Create instances of MyClass and AnotherClass
        MyClass1 myObject = new MyClass1();
        AnotherClass anotherObject = new AnotherClass();

        // Call debugInfo and debugError on both objects
        myObject.debugInfo();
        myObject.debugError("MyClass Error");

        anotherObject.debugInfo();
        anotherObject.debugError("AnotherClass Error");
    }
}
