package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car1 = new Car();
        car1.license = "AMQ123";
        car1.driver = "Andres Herrera";
        car1.passenger = 4;
        car1.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE576";
        car2.driver = "Andrea Herrea";
        car2.passenger = 3;
        car2.printDataCar();
    }
}