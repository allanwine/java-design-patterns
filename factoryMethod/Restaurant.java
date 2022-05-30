package factoryMethod;


// ** Factory Method pattern **
// Creational design pattern that loosens the coupling of a given code by separating the product's construction code from the code that uses that product.

// When to use it: if you have little information about the types of the objects your code will be working with. This pattern makes it easy to extend the product construction code independently from the client code and allows introducing new products without changing the client code.

public abstract class Restaurant {
  public Burger orderBurger() {
    Burger burger = createBurger();
    burger.prepare();
    return burger;
  }

  public abstract Burger createBurger();
  public static void main(String[] args) {
    Restaurant beefRestaurant = new BeefBurgerRestaurant();
    Burger beefBurger = beefRestaurant.orderBurger();

    Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
    Burger veggieBurger = veggieRestaurant.orderBurger();
  }
}

