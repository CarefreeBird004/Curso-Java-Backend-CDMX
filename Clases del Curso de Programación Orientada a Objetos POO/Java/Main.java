package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera Toledo", "AND123"),"Chevrolet","Cehvy");
        uberX.setPassenger(4); 
        uberX.printDataCar();

       // Car car2 = new Car("QWE576",new Account("Andrea Herrera", "AND1123") );
        //car2.passenger = 3;
        //car2.printDataCar();
        
        UberVan uberVan = new UberVan("ACSA21", new Account("Andres Toledo", "asd12"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}