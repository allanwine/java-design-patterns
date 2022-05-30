package abstractFactory;

public class AsusFactory extends Factory {
  @Override
  public Gpu createGpu() {
    return new AsusGpu();
  }

  @Override
  public Monitor createMonitor() {
    return new AsusMonitor();
  }
}
