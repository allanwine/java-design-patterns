package builder;

// Directors defines the order in which we should call the construction steps so that we can reuse specific configurations of the products we are building.

public class Director {
  public void buildBugatti(CarBuilder builder) {
    builder.brand("Bugatti")
      .model("Veyron")
      .color("Black")
      .nbrDoors(2)
      .engine("V8")
      .price(1000000);
  }

  public void buildFerrari(CarBuilder builder) {
    builder.brand("Ferrari")
      .model("F40")
      .color("Red")
      .nbrDoors(2)
      .engine("V8")
      .price(1000000);
  }
}
