public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono $200
        salary = salary + 200;
        System.out.println("Total: " + salary);

        //pension: $50 descuento
        salary -= 50;
        System.out.println("Total: " + salary);

        //2 horas extras $30 c/u
        //Comida: $45
        salary = salary + (2*30)-45;
        System.out.println("Total: " + salary);

        //Actualizando cadena de texto
        String employeeName = "Anahi Salgado";
        employeeName = employeeName + " Díaz de la Vega";
        System.out.println("Empleado: " + employeeName);

        employeeName = "Irene " + employeeName;
        System.out.println("Empleado: " + employeeName);
    }
}
