package builder;

public class Car {
  private final int id;
  private final String brand;
  private final String model;
  private final String color;
  private final int nbrDoors;
  private final String engine;
  private final int price;

  Car(int id, String brand, String model, String color, int nbrDoors, String engine, int price) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.nbrDoors = nbrDoors;
    this.engine = engine;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Car: {" +
        "id=" + id +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", nbrDoors=" + nbrDoors +
        ", engine='" + engine + '\'' +
        ", price=" + price +
        '}';
  }
}
