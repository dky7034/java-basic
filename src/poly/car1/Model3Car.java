package poly.car1;

public class Model3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("Model3.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3.pressAccelerator");
    }
}
