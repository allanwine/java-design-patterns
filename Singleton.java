// ** Singleton pattern **
// Creational design pattern that ensures that a class has only one instance, and provides a global (single) point of access to it. It lets you access your object from anywhere in your application and encapsulates the attributes and methods of the object in one class.

/* Single thread solution
public class Singleton {

  private static Singleton instance;
  private String data;

  private Singleton(String data) {
    this.data = data;
  }

  public static Singleton getInstance(String data) {
    if (instance === null) {
      instance = new Singleton(data);
    }
    return instance;
  }
}
*/

// Multi-thread solution
public class Singleton {

  // Volatile is used to ensure visibility of instance variable, blocking other threads from reading it before it is fully initialized, but it cannot be cached
  private static volatile Singleton instance;
  private String data;

  private Singleton(String data) {
    this.data = data;
  }

  public static Singleton getInstance(String data) {

    // Storing the instance in a local variable, so that the process only has to access the main memory once
    Singleton result = instance;

    // double-check locking, limits synchronization to the case where instance is null and skips the synchronized block when retrieving an already created instance
    if (result == null) {
      synchronized (Singleton.class) {
        result = instance;
        if (result == null) {
          instance = new Singleton(data);
        }
      }
    }
    return result;
  }
}