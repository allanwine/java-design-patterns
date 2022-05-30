package abstractFactory;


// ** Abstract factory pattern **
// Creational design pattern that extends on the idea of the factory method pattern and allows to produce families of related objects without specifying their concrete classes.

// When to use it: if your code needs to work with various families of related products.

public abstract class Factory {
  public Gpu assembleGpu() {
    Gpu gpu = createGpu();
    gpu.assemble();
    return gpu;
  }

  public Monitor assembleMonitor() {
    Monitor monitor = createMonitor();
    monitor.assemble();
    return monitor;
  }

  public abstract Gpu createGpu();
  public abstract Monitor createMonitor();

  public static void main(String[] args) {
    Factory asus = new AsusFactory();
    Gpu asusGpu = asus.assembleGpu();
    Monitor asusMonitor = asus.assembleMonitor();

    Factory msi = new MsiFactory();
    Gpu msiGpu = msi.assembleGpu();
    Monitor msiMonitor = msi.assembleMonitor();
  }
}

