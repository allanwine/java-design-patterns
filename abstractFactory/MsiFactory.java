package abstractFactory;

public class MsiFactory extends Factory {
  @Override
  public Gpu createGpu() {
    return new MsiGpu();
  }

  @Override
  public Monitor createMonitor() {
    return new MsiMonitor();
  }
}
