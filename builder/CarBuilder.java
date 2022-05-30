package builder;
// ** Builder Pattern **

// The Builder Pattern is a creational design pattern that allows us to produce different types and representations of an object using the same construction process. It extracts the object construction or creation logic out of its own class and move it to separate objects builders.

// With this pattern we can create builders containing different representations (fields) of the same object. We can also use directors if the same creation code is used to create several objects.

public class CarBuilder {
  private int id;
  private String brand;
  private String model;
  private String color;
  private int nbrDoors;
  private String engine;
  private int price;

  public CarBuilder id(int id) {
    this.id = id;
    return this;
  }

  public CarBuilder brand(String brand) {
    this.brand = brand;
    return this;
  }

  public CarBuilder model(String model) {
    this.model = model;
    return this;
  }

  public CarBuilder color(String color) {
    this.color = color;
    return this;
  }

  public CarBuilder nbrDoors(int nbrDoors) {
    this.nbrDoors = nbrDoors;
    return this;
  }

  public CarBuilder engine(String engine) {
    this.engine = engine;
    return this;
  }

  public CarBuilder price(int price) {
    this.price = price;
    return this;
  }

  public Car build() {
    return new Car(id, brand, model, color, nbrDoors, engine, price);
  }

  public static void main (String[] args) {
    Director director = new Director();
    CarBuilder builder = new CarBuilder();
    director.buildBugatti(builder);

    Car car = builder.build();
    System.out.println(car);

    // creating a different representation of a car
    CarBuilder builder2 = new CarBuilder();
    builder2.id(2).brand("Ford").model("Mustang").color("Red");
    Car car2 = builder2.build();
    System.out.println(car2);
  }

}


